/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.news.beans;
import java.sql.Date;
/**
 *
 * @author ROii
 */
public class Noticia {
    private Date Fecha;
    private String Descripcion;

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
