/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;

/**
 *
 * @author tito
 */
public class Sala {
    private int sala_id;
    private String nombre;
    private int establecimiento_id;
    private String estado;
    Coneccion con;

    public Sala(){
        con=new Coneccion();
    }
    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(int establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void save(){
    con.setInsertar("insert into Salas(nombre,establecimiento_id,estado)values('"+this.getNombre()+"','"+this.getEstablecimiento_id()+"','activo')");
}
     public void delete(){
     con.setInsertar("update salas set estado='pasivo' where sala_id='"+this.getSala_id()+"'");
 }
    public void update(){
        con.setInsertar("update salas set nombre='"+this.getNombre()+"',establecimiento_id='"+this.getEstablecimiento_id()+"' where sala_id='"+this.getSala_id()+"' ");
    }
}
