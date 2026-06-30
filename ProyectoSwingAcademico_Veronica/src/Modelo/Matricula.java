/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author verom
 */
public class Matricula {
    private int id;
    private String fechaMatricula;
    private String estado;

    public Matricula(int id, String fechaMatricula,String estado) {
        this.id = id;
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public String getEstado() {
        return estado;
    }
}
