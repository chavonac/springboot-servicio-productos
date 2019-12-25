/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.lobos.springbootservicioproductos.models.controllers;

import java.util.List;
import java.util.stream.Collectors;

import mx.com.lobos.springbootservicioproductos.models.entity.Producto;
import mx.com.lobos.springbootservicioproductos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chavon
 */
@RestController
public class ProductoController {
	
	@Autowired
	private Environment env;

	@Value("${server.port}")
	private Integer port;
	
    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll().stream().map(producto -> {
//        	producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        	producto.setPort(port);
        	return producto;
        }).collect(Collectors.toList());
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id) {
    	Producto producto = productoService.findById(id);
//    	producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
    	producto.setPort(port);
    	return productoService.findById(id);
    }

}
