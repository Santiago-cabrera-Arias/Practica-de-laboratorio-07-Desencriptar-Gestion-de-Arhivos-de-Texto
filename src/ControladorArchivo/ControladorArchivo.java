/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorArchivo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author santiago Cabrera.
 */
public class ControladorArchivo {

    //Atributos.
    private File Archivo;
    private String ruta;

    //Creamos un map el cual no nos permite crear llaves duplicadas
    private Map<String, String> texto;

    /**
     * Metodo Constructor.
     *
     * En este metodo instanciamos el Map y le agregamos el metodo
     * diccionarioAbecedario.
     *
     */
    public ControladorArchivo() {

        texto = new HashMap<>();

    }
    
     /**
     * Metodo desencriptarTexto.
     *
     * En este metodo desencriptamos el texto que hemos encriptado
     * anteriormente, debemos llamarle al texto con el JFileChooser .
     *
     *
     * @param mensaje
     * @return
     */
    public String desencriparTexto(String mensaje) {

        String texto = "";
        for (int i = 0; i < mensaje.length(); i++) {
            String letra = mensaje.charAt(i) + "";
            if (!letra.equals("+")) {
                for (Map.Entry<String, String> entry : this.texto.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (letra.equals(value)) {
                        texto += key;
                    }
                }
            } else {
                texto += " ";

            }
        }
        return texto;
    }

}
