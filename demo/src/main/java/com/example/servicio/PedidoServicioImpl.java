package com.example.servicio;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.modelo.Pedido;
import com.example.dao.PedidoDao;
import com.example.dto.ProductoDto;

@Service
public class PedidoServicioImpl implements PedidoServicio {
    @Autowired
    PedidoDao dao;

    @Autowired
    RestTemplate template;

    String url = "http://localhost:7777/productos";

    @Override
    public List<Pedido> altaPedido(String nombreProducto, int unidades) {
        List<ProductoDto> ListaProductoDto = Arrays.asList(template.getForObject(url, ProductoDto[].class));
        Pedido pedido = null;
        ProductoDto productoo = null;

        for (ProductoDto producto : ListaProductoDto) {

            if (producto.getProducto().equalsIgnoreCase(nombreProducto)) {
                pedido = new Pedido(producto.getCodigoProducto(), unidades, producto.getPrecioUnitario() * unidades,
                        new Date());

                productoo = producto;
            }

        }

        dao.save(pedido);

        int resultado = productoo.getStock() - unidades;
        productoo.setStock(resultado);

        template.put(url, productoo);

        return dao.findAll();
    }

    @Override
    public List<Pedido> listaPedido() {
        return dao.findAll();

    }

}