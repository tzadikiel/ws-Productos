package com.tzadikiel.productos.models.service;

import java.util.List;

import com.tzadikiel.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);

}
