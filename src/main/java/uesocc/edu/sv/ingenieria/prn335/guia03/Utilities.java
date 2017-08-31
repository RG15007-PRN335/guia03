package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jcsantos
 */

@LocalBean
@Dependent
public class Utilities implements Serializable{
    
    /**
     * Selecciona y devuelva los primeros 20 caracteres de un texto
     * @param texto Cadena de texto que contiene la introducción de un determinado post.
     * @return Las primeras 20 letras del texto recibido.
     */
    public String getResume(String texto) {
        if(texto==null){
            return null;
        }else{
       char caracter=' ';
       int tamanio=texto.length();
       if(tamanio>=20){
       String frase="";
        for(int i=0; i<20; i++){
            caracter=texto.charAt(i);
            frase+=caracter;
        }
         return frase;
       }else          
       return texto;
        }
    }
    /**
     * Convierte la primera letra de cada palabra a mayúscula y las restantes en minúsculas, ademas elimina los dobles espacios
     * @param texto Cadena de texto que contiene el título de un determinado post.
     * @return El texto que se ha recibido con cada palabra capitalizada y sin dobles espacios.
     */
    public String capitalizar(String texto) {
        if(texto==null){
            return null;
        }else{
        int cont = 0;
        String frase = "";
        char[] caracteres = texto.toCharArray();
       
        for (int i = 0; i < texto.length(); i++) {
            caracteres[i]=Character.toLowerCase(caracteres[i]);
            if  (caracteres[i] == ' '){
            caracteres[i + 1] = Character.toLowerCase(caracteres[i + 1]);
            }
            }
        
        for (int i = 0; i < texto.length(); i++) {
            //la primera letra es mayuscula
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            // Reemplazamos por mayuscula
            if (i!=0) {
            }
            if (caracteres[i] == ' ') {
                int p = i;
                cont = 0;
                while (caracteres[(p)] == ' ') {
                    p++;
                    cont += 1;
                }
                if (cont >= 2) {
                    continue;
                } else {
                    caracteres[i + cont] = Character.toUpperCase(caracteres[i + cont]);
                }
            }
            frase += caracteres[i];
        }
        return frase;
    }
    }
    
    /**
     * Cuenta la cantidad de veces que se repite una palabra en una cadena de texto
     * @param frase cadena de texto que contiene la frase a buscar.
     * @param cadena cadena de texto donde se buscaran las coincidencias.
     * @return La cantidad de coincidencias de la frase en el texto recibido.
     */
    public int contarCoincidencias(String Cadena, String frase) { 
        if(Cadena==null){
            return 0;
        }else{
        
            
    int i = 0,contador = 0;
    while (i != -1){
    i = Cadena.indexOf(frase,i);
    if (i != -1){
    i++;
    contador++;
}
}
return contador;

        
        
        
        
        }
    
    
    }
}

    
