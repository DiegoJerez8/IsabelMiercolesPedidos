package com.example.servicio;

import java.util.List;

import com.example.modelo.Pedido;

public interface PedidoServicio {

	/**
	 * acciones que quiero que realice , la implementacion se realizará en
	 * EjemplatServiceImpl.java
	 * 
	 * @return
	 */
    List<Pedido> altaPedido(String nombreProducto, int unidades);
    List<Pedido> listaPedido();
}
