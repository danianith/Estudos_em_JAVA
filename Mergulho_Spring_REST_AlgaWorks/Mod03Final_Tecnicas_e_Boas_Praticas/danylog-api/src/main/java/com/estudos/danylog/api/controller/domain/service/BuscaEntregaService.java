package com.estudos.danylog.api.controller.domain.service;

import org.springframework.stereotype.Service;

import com.estudos.danylog.api.controller.domain.exception.EntidadeNaoEncontradaException;
import com.estudos.danylog.api.controller.domain.model.Entrega;
import com.estudos.danylog.domain.repository.EntregaRepository;

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