/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class ValidadorUtil {

    public static boolean esVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    public static boolean esNumeroValido(int numero) {
        return numero > 0;
    }
}
