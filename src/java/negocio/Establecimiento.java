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
public class Establecimiento {
    private int establecimiento_id;
    private String nombre;
    private String fecha_creacion;
    private int ciudad_id;
    private String estado;
    private String creado_por;
    Coneccion con;
    public Establecimiento(){
        con=new Coneccion();
    }

    public int getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(int establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }
    public void save(){
    con.setInsertar("insert into establecimientos(nombre,fecha_creacion,ciudad_id,creado_por,estado)values('"+this.getNombre()+"','"+this.getFecha_creacion()+"','"+this.getCiudad_id()+"','"+this.getCreado_por()+"','activo')");
}
 public void update(){
     con.setInsertar("update Establecimientos set nombre='"+this.getNombre()+"',fecha_creacion='"+this.getFecha_creacion()+"',ciudad_id='"+this.getCiudad_id()+"',creado_por='"+this.getCreado_por()+"' where establecimiento_id='"+this.getEstablecimiento_id()+"' ");
 }
    public void delete (){
        con.setInsertar("update Establecimientos set estado='pasivo' where establecimiento_id='"+this.getEstablecimiento_id()+"'");
    }

 
    
}
