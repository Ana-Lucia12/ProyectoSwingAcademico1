/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import Modelo.Calificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yarie
 */
public class CalificacionRepositorio {
    
    private List<Calificacion> list = new ArrayList<>();
    
    public void agregar(Calificacion calificacion) {
        list.add(calificacion);
    }

    public List<Calificacion> obtenerTodas() {
        return list;
    }
}
