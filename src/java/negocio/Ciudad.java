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
public class Ciudad {
     private int ciudad_id;
   private String nombre;
   private int pais_id;
   private String estado;
    Coneccion con;
    public Ciudad(){
        con=new Coneccion();
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void save(){
    con.setInsertar("insert into Ciudades(nombre,pais_id,estado)values('"+this.getNombre()+"','"+this.getPais_id()+"','activo')");
}
 public void delete(){
     con.setInsertar("update ciudades set estado='pasivo' where ciudad_id='"+this.getCiudad_id()+"'");
 }
    public void update(){
        con.setInsertar("update Ciudades set nombre='"+this.getNombre()+"',pais_id='"+this.getPais_id()+"' where ciudad_id='"+this.getCiudad_id()+"' ");
    }
    
    
}
