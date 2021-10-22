package br.com.logistics.domain.service;

import org.springframework.stereotype.Service;

import br.com.logistics.domain.exception.EntidadeNaoEncontradaException;
import br.com.logistics.domain.model.Entrega;
import br.com.logistics.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
