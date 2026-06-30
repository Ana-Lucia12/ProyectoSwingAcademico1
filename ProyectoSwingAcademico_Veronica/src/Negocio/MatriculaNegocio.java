/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import excepciones.MatriculaInvalidaException;
import java.util.List;
import java.util.Stack;
import modelo.Matricula;
import repositorio.MatriculaRepositorio;

/**
 *
 * @author verom
 */
public class MatriculaNegocio {
    
    private MatriculaRepositorio repo;
    private Stack<String> historial;

    public MatriculaNegocio() {

        repo = new MatriculaRepositorio();
        historial = new Stack<>();
    }

    public void matricular(Matricula matricula)
            throws MatriculaInvalidaException {

        if(matricula == null){

            throw new MatriculaInvalidaException(
                    "La matrícula es inválida");
        }

        repo.agregar(matricula);

        historial.push(
                "Matrícula registrada ID: "
                + matricula.getId()
        );
    }

    public void eliminar(Matricula matricula){

        repo.eliminar(matricula);

        historial.push(
                "Matrícula eliminada ID: "
                + matricula.getId()
        );
    }

    public List<Matricula> listar(){

        return repo.listar();
    }

    public Stack<String> getHistorial(){

        return historial;
    }
}
