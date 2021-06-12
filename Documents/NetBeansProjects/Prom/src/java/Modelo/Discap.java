/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;


@ManagedBean
@ApplicationScoped
public class Discap {
    
    private String usuario, edad, discapacidad;

    
    public Discap() {
        
        
    }
    public String getDiscapacidad() {
        return discapacidad;
    }
    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;

    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
