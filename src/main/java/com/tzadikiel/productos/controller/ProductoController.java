package com.tzadikiel.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tzadikiel.productos.models.entity.Producto;
import com.tzadikiel.productos.models.service.ProductoServiceImpl;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoServiceImpl.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoServiceImpl.findById(id);
	}

}
