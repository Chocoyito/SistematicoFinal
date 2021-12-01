/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematicofinalpoo;

import dao.DEmpleadoOficina;
import dao.DEmpleadoProduccion;
import modelos.Empleado;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Josar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        EmpleadoOficina marin = new EmpleadoOficina("Marin", "Jimenez", 4, 2, 3000);
        EmpleadoOficina ramon = new EmpleadoOficina("Ramon", "Martinez", 5, 4, 4000);
        EmpleadoOficina carlos = new EmpleadoOficina("Carlos", "Jimenez", 6, 5, 2000);
        
        EmpleadoProduccion hugo = new EmpleadoProduccion(225 ,"Hugo", "Diaz", 7, 2, 3500);
        EmpleadoProduccion jesus = new EmpleadoProduccion(600, "Jesus", "Amador", 8, 4, 5000);
        EmpleadoProduccion diego = new EmpleadoProduccion(400, "Diego", "Maradona", 9, 5, 3400);
        
        DEmpleadoOficina daoOficina = new DEmpleadoOficina();
        
        daoOficina.agregarRegistro(marin);
        daoOficina.agregarRegistro(ramon);
        daoOficina.agregarRegistro(carlos);
        
        
        DEmpleadoProduccion daoProduccion = new DEmpleadoProduccion();
        
        daoProduccion.agregarRegistro(hugo);
        daoProduccion.agregarRegistro(jesus);
        daoProduccion.agregarRegistro(diego);

        daoOficina.mostrarRegistros();
        daoProduccion.mostrarRegistros();
    }
}
