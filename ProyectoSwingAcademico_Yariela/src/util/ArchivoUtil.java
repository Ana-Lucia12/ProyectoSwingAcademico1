/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author yarie
 */
public class ArchivoUtil {
   
    public static void guardarCSV(String ruta, String contenido)
            throws IOException {


        FileWriter archivo = new FileWriter(ruta);


        archivo.write(contenido);


        archivo.close();


    }
}
