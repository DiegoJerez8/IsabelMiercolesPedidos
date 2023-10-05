package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.modelo.Pedido;
import com.example.servicio.PedidoServicio;

@RestController
public class PedidoControlador {
    @Autowired
    PedidoServicio servicio;

    @GetMapping(value = "pedido", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> listarPedidosActual() {
        return servicio.listaPedido();
    }

     @PostMapping(value = "pedido/{nombreProducto}/{unidades}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> altaPedido(@PathVariable("nombreProducto")String nombreProducto,@PathVariable("unidades") int unidades ) {

        return servicio.altaPedido(nombreProducto, unidades);
    }
}
