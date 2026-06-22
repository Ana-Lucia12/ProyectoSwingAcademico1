/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import excepciones.DatoInvalidoException;
import excepciones.RegistroDuplicadoException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Modelo.Estudiante;
import repositorio.EstudianteRepositorio;

public class EstudianteNegocio {

    private EstudianteRepositorio repositorio;

    public EstudianteNegocio() {
        repositorio = new EstudianteRepositorio();
    }

    public void agregar(Estudiante estudiante)
            throws DatoInvalidoException,
            RegistroDuplicadoException {

        validar(estudiante);

        for (Estudiante e : repositorio.listar()) {

            if (e.getCorreo().equalsIgnoreCase(estudiante.getCorreo())) {

                throw new RegistroDuplicadoException(
                        "Ya existe un estudiante con ese correo");
            }
        }

        repositorio.agregar(estudiante);
    }

    private void validar(Estudiante e)
            throws DatoInvalidoException {

        if (e.getNombre().trim().length() < 3) {
            throw new DatoInvalidoException(
                    "El nombre debe tener mínimo 3 caracteres");
        }

        if (e.getEdad() <= 0) {
            throw new DatoInvalidoException(
                    "La edad debe ser mayor que 0");
        }

        if (!e.getCorreo().contains("@")) {
            throw new DatoInvalidoException(
                    "Correo inválido");
        }

        if (!e.getTelefono().matches("\\d+")) {
            throw new DatoInvalidoException(
                    "El teléfono debe ser numérico");
        }

        if (e.getCarrera().isEmpty()) {
            throw new DatoInvalidoException(
                    "Debe indicar una carrera");
        }
    }

    public List<Estudiante> listar() {
        return repositorio.listar();
    }

    public void ordenarPorNombre() {

        Collections.sort(
                repositorio.listar(),
                Comparator.comparing(Estudiante::getNombre)
        );
    }

    public void ordenarPorEdad() {

        Collections.sort(
                repositorio.listar(),
                Comparator.comparingInt(Estudiante::getEdad)
        );
    }
}
