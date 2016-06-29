/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;

/**
 *
 * @author Administrador
 */
public class Pais {
    private int pais_id;
    private String nombre;
    private String estado;
    Coneccion con;
    public Pais(){
        con=new Coneccion();
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void save(){
        con.setInsertar("insert into paises(nombre,estado) values('"+this.getNombre()+"','activo')");
    
}
 public void update(){
     con.setInsertar("update paises set nombre='"+this.getNombre()+"' where pais_id='"+this.getPais_id()+"'");
 }
    public void delete (){
        con.setInsertar("update paises set estado='pasivo' where pais_id='"+this.getPais_id()+"'");
    }
    
}
