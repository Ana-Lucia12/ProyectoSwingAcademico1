/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import modelo.Curso;
import repositorio.CursoRepositorio;
import excepciones.DatoInvalidoException;
import excepciones.RegistroDuplicadoException;
import util.ValidadorUtil;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;

public class CursoNegocio {

    private CursoRepositorio repo = new CursoRepositorio();

    public void agregarCurso(Curso curso)
            throws DatoInvalidoException, RegistroDuplicadoException {

        if (ValidadorUtil.esVacio(curso.getCodigo())) {
            throw new DatoInvalidoException("El código es obligatorio");
        }

        if (ValidadorUtil.esVacio(curso.getNombre())) {
            throw new DatoInvalidoException("El nombre es obligatorio");
        }

        if (curso.getCreditos() <= 0) {
            throw new DatoInvalidoException("Créditos deben ser mayores a 0");
        }

        if (repo.existeCodigo(curso.getCodigo())) {
            throw new RegistroDuplicadoException("Ya existe un curso con ese código");
        }

        repo.agregar(curso);
    }

    public List<Curso> listarCursos() {
        return repo.obtenerTodos();
    }
    
    public Curso buscarCurso(String texto) {
    return repo.buscar(texto);
    }
    
    public void eliminarCurso(String codigo) {
    repo.eliminar(codigo);
    }
    
    public void editarCurso(Curso curso) {
    repo.actualizar(curso);
    }
    
    public void ordenarPorCodigo(){
        Collections.sort(
                repo.obtenerTodos(),
                Comparator.comparing(Curso::getCodigo)
        );
    }
    
    public void ordenarPorNombre() {
        Collections.sort(
                repo.obtenerTodos(),
                Comparator.comparing(Curso::getNombre)
        );
    }
}