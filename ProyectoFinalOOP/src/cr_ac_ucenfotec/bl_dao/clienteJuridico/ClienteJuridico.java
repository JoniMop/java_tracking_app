/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr_ac_ucenfotec.bl_dao.clienteJuridico;

import cr_ac_ucenfotec.bl_dao.cliente.Cliente;
import java.util.Objects;

public class ClienteJuridico extends Cliente {
   
    private String cedula_juridica;
    private String contacto;

    public ClienteJuridico() {
    }

    public ClienteJuridico(String cedula_juridica, String contacto) {
        this.cedula_juridica = cedula_juridica;
        this.contacto = contacto;
    }

   

    

   

    

   

    public String getCedula_juridica() {
        return cedula_juridica;
    }

    public void setCedula_juridica(String cedula_juridica) {
        this.cedula_juridica = cedula_juridica;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" + "cedula_juridica=" + cedula_juridica + ", contacto=" + contacto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteJuridico other = (ClienteJuridico) obj;
        if (!Objects.equals(this.cedula_juridica, other.cedula_juridica)) {
            return false;
        }
        return true;
    }

   

    
    
}

