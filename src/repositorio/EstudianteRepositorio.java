/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;

public class EstudianteRepositorio {

    private List<Estudiante> estudiantes;

    public EstudianteRepositorio() {
        estudiantes = new ArrayList<>();
    }

    public void agregar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> listar() {
        return estudiantes;
    }

    public void eliminar(int id) {

        estudiantes.removeIf(e -> e.getId() == id);
    }
}