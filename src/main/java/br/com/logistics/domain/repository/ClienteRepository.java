package br.com.logistics.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.logistics.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByNome(String nome); //nome exato, sem like

	List<Cliente> findByNomeContaining(String nome); // utilizando like na consulta
	
	Optional<Cliente> findByEmail(String email);
	
}
