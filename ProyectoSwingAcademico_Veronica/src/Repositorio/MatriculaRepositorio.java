/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Matricula;

/**
 *
 * @author verom
 */
public class MatriculaRepositorio {
    
   private List<Matricula> lista;

    public MatriculaRepositorio() {

        lista = new ArrayList<>();
    }

    public void agregar(Matricula matricula) {

        lista.add(matricula);
    }

    public void eliminar(Matricula matricula) {

        lista.remove(matricula);
    }

    public List<Matricula> listar() {

        return lista;
    }
}
