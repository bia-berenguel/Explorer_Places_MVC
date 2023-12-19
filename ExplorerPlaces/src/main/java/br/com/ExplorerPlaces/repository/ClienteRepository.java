package br.com.ExplorerPlaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ExplorerPlaces.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
