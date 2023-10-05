package com.example.dto;

public class ProductoDto {

    private int codigoProducto;
    private String producto;
    private int precioUnitario;
    private int stock;

    public ProductoDto(int codigoProducto, String producto, int precioUnitario, int stock) {
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public ProductoDto() {
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProducto;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
        result = prime * result + precioUnitario;
        result = prime * result + stock;
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
        ProductoDto other = (ProductoDto) obj;
        if (codigoProducto != other.codigoProducto)
            return false;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        if (precioUnitario != other.precioUnitario)
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", producto=" + producto + ", precioUnitario="
                + precioUnitario + ", stock=" + stock + "]";
    }

}
