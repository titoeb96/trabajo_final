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
public class Alumno {
    private int alumno_id;
    private String nombre;
    private String apepat;
    private String apemat;
    private String fecha_nacimiento;
    private int sala_id;
    private String estado;
    Coneccion con;

    public Alumno(){
        con=new Coneccion();
    }
    public int getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
       public void save(){
    con.setInsertar("insert into alumnos(nombre,apepat,apemat,fecha_nacimiento,sala_id,estado)values('"+this.getNombre()+"','"+this.getApepat()+"','"+this.getApemat()+"','"+this.getFecha_nacimiento()+"','"+this.getSala_id()+"','activo')");
}
        public void update(){
     con.setInsertar("update alumnos set nombre='"+this.getNombre()+"',apepat='"+this.getApepat()+"',apemat='"+this.getApemat()+"',fecha_nacimiento='"+this.getFecha_nacimiento()+"',sala_id='"+this.getSala_id()+"' where alumno_id='"+this.getAlumno_id()+"' ");
 }
    public void delete (){
        con.setInsertar("update Alumnos set estado='pasivo' where alumno_id='"+this.getAlumno_id()+"'");
    }
}