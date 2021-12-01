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
public class Empleado {

    private String nombre;
    private String apellidos;
    private int id;
    private double horasExtras;
    private double salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, int id, double horasExtras, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.horasExtras = horasExtras;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioBruto() {
        double precioHoras = 200;
        return (salarioBase + (precioHoras * horasExtras));
    }

    public float calcularSalarioNeto() {
        float neto = (float) (calcularSalarioBruto() - calcularSeguro());
        return neto;
    }

    public double calcularSeguro() {
        return calcularSalarioBruto() * 0.07;
    }

}
