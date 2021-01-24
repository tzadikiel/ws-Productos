package com.tzadikiel.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tzadikiel.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
