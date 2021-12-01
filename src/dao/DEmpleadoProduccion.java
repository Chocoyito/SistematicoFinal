/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Josar
 */
public class DEmpleadoProduccion implements IOperaciones{

    @Override
    public void agregarRegistro(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ArrayList<EmpleadoProduccion> listaOficina = new ArrayList<>();
    
    public void agregarRegistro(EmpleadoProduccion e){
        EmpleadoProduccion empleado = new EmpleadoProduccion();
        
        empleado.setId(e.getId());
        empleado.setNombre(e.getNombre());
        empleado.setApellidos(e.getApellidos());
        empleado.setHorasExtras(e.getHorasExtras());
        empleado.setSalarioBase(e.getSalarioBase());
        empleado.setBono(e.getBono());
        listaOficina.add(empleado);
    }

    @Override
    public void mostrarRegistros() {
        String cadena = "";
        for (int i = 0; i < listaOficina.size(); i++) {
            cadena += "Id: " + listaOficina.get(i).getId() + "\n";
            cadena += "Nombre: " + listaOficina.get(i).getNombre() + "\n";
            cadena += "Apellidos: " + listaOficina.get(i).getApellidos() + "\n";
            cadena += "Salario base: " + listaOficina.get(i).getSalarioBase() + "\n";
            cadena += "Salario bruto: " + listaOficina.get(i).calcularSalarioBruto() + "\n";
            cadena += "Salario neto: " + (listaOficina.get(i).calcularSalarioNeto() + listaOficina.get(i).getBono()) + "\n\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
}
