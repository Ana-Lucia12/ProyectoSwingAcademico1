/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import Modelo.Calificacion;
import repositorio.CalificacionRepositorio;
import java.util.List;

/**
 *
 * @author yarie
 */
public class CalificacionNegocio {
    
    private HistorialAcciones historial =
        new HistorialAcciones();

    private CalificacionRepositorio repositorio =
        new CalificacionRepositorio(); 
    
    public void agregar(Calificacion c) {
        
        repositorio.agregar(c);

        historial.agregarMovimiento("Se registró una calificación");
    }
    
    public List<Calificacion> obtenerTodas() {
        return repositorio.obtenerTodas();
    }
    
}


