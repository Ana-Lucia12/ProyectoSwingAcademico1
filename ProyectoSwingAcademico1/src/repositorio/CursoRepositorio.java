/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import modelo.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoRepositorio {

    private List<Curso> listaCursos = new ArrayList<>();

    public void agregar(Curso curso) {
        listaCursos.add(curso);
    }

    public List<Curso> obtenerTodos() {
        return listaCursos;
    }

    public boolean existeCodigo(String codigo) {
        return listaCursos.stream()
                .anyMatch(c -> c.getCodigo().equalsIgnoreCase(codigo));
    }

    public void eliminar(String codigo) {
        listaCursos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigo));
    }
    
    
     public Curso buscarPorCodigo(String codigo){
        for (Curso curso : listaCursos) {
        if (curso.getCodigo().equalsIgnoreCase(codigo)){
            return curso;
            }
        }
       return null; 
    }
     
    public void actualizar(Curso cursoActualizado) {

        for (int i = 0; i < listaCursos.size(); i++) {

            if (listaCursos.get(i).getCodigo()
                .equalsIgnoreCase(cursoActualizado.getCodigo())) {

                listaCursos.set(i, cursoActualizado);
                return;
            }
        }   
    }
     
    public Curso buscar(String texto) {
        
        for (Curso curso : listaCursos) {
            if (curso.getCodigo().equalsIgnoreCase(texto)
                    || curso.getNombre().equalsIgnoreCase(texto)) {
                return curso;
            }
        }
        return null;
    }
}

   


