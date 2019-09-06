/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.clienteFisico;

import cr_ac_ucenfotec.bl_dao.cliente.Cliente;


/**
 *
 * @author jonatangur-ari
 */
public class ClienteFisico extends Cliente {
    private String primer_apellido;
    private String segundo_apellido;

    public ClienteFisico() {
    }

    public ClienteFisico(String primer_apellido, String segundo_apellido) {
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

   

    
   


    

   

 

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }
    
    

   

    @Override
    public String toString() {
        return "ClienteFisico{" + "primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + '}';
    }

   
}   
    