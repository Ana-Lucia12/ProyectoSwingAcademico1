/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Stack;

/**
 *
 * @author yarie
 */
public class HistorialAcciones {
    
    private  Stack<String> historial = new Stack<>();
    
    public void agregarMovimiento(String movimiento) {
        historial.push(movimiento);
    }
    
    public Stack <String> obtenerHistorial() {
        return historial;
    }
}
