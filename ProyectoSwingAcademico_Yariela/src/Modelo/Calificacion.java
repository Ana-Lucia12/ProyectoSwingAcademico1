/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author yarie
 */
public class Calificacion {
    private int id;  
    private double nota; 
    private String observacion;
    
     public void setNota(double nota) {
        this.nota = nota;
    }
     
    public double getNota() {
        return nota;
    }
    
    public String getEstado(){

    if(nota >= 70){
         return "Aprobado";
    }else
    return "Reprobado";
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}


