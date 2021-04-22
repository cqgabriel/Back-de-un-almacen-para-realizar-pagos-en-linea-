package com.almacen.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almacen.api.models.entitys.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
