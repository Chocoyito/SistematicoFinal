/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.EmpleadoOficina;

/**
 *
 * @author Josar
 */
public class DEmpleadoOficina implements IOperaciones {

    @Override
    public void agregarRegistro(Object o) {

    }
    ArrayList<EmpleadoOficina> listaOficina = new ArrayList<>();

    public void agregarRegistro(EmpleadoOficina e) {

        EmpleadoOficina empleado = new EmpleadoOficina();

        empleado.setId(e.getId());
        empleado.setNombre(e.getNombre());
        empleado.setApellidos(e.getApellidos());
        empleado.setHorasExtras(e.getHorasExtras());
        empleado.setSalarioBase(e.getSalarioBase());
        
        listaOficina.add(empleado);

    }

    @Override
    public void mostrarRegistros() {
        String cadena = "";
        for (int i = 0; i < listaOficina.size(); i++) {
            cadena += "Id: " + listaOficina.get(i).getId() + "\n";
            cadena += "Nombre: " + listaOficina.get(i).getNombre() + "\n";
            cadena += "Apellidos: " + listaOficina.get(i).getApellidos() + "\n";
            cadena += "Horas extras: " + listaOficina.get(i).getHorasExtras() + "\n";
            cadena += "Salario base: " + listaOficina.get(i).getSalarioBase() + "\n";
            cadena += "Salario bruto: " + listaOficina.get(i).calcularSalarioBruto() + "\n";
            cadena += "Salario neto: " + listaOficina.get(i).calcularSalarioNeto()+ "\n\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

}
