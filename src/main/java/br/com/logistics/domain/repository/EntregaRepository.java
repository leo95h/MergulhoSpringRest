package br.com.logistics.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.logistics.domain.model.Entrega;

public interface EntregaRepository extends JpaRepository<Entrega, Long> {

}
