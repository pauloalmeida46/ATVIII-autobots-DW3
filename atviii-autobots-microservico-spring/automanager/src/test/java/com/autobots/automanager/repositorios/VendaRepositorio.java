package com.autobots.automanager.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobots.automanager.entidades.Venda;

public interface VendaRepositorio extends JpaRepository<Venda, Long> {

}