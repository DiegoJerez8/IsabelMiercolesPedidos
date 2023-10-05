package com.example.modelo;

import java.lang.annotation.Inherited;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    private int idpedidos;
    private int codigoProducto;
    private int unidades;
    private double total;
    private Date fecha;
   
   
    public Pedido() {
    }


    public Pedido(int codigoProducto, int unidades, double total, Date fecha) {
        
        this.codigoProducto = codigoProducto;
        this.unidades = unidades;
        this.total = total;
        this.fecha = fecha;
    }


    public int getIdpedidos() {
        return idpedidos;
    }


    public void setIdpedidos(int idpedidos) {
        this.idpedidos = idpedidos;
    }


    public int getCodigoProducto() {
        return codigoProducto;
    }


    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }


    public int getUnidades() {
        return unidades;
    }


    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idpedidos;
        result = prime * result + codigoProducto;
        result = prime * result + unidades;
        long temp;
        temp = Double.doubleToLongBits(total);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (idpedidos != other.idpedidos)
            return false;
        if (codigoProducto != other.codigoProducto)
            return false;
        if (unidades != other.unidades)
            return false;
        if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Pedido [idpedidos=" + idpedidos + ", codigoProducto=" + codigoProducto + ", unidades=" + unidades
                + ", total=" + total + ", fecha=" + fecha + "]";
    }

    
   
}
