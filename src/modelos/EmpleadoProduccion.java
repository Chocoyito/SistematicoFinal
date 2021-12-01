/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Josar
 */
public class EmpleadoProduccion extends Empleado{
    private double bono;
    
    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(double bono, String nombre, String apellidos, int id, double horasExtras, double salarioBase) {
        super(nombre, apellidos, id, horasExtras, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
}
