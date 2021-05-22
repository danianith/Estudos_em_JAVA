package com.estudos.danylog.api.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaInput {

	@NotBlank
	private String descricao;

	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}
	
}