package com.example.openapiapp.communication.dto;

/**
 * Enum declarado em Java devido a esse BUG:
 * https://github.com/micronaut-projects/micronaut-openapi/issues/358
 * Corrigido na versão micronaut-core:3.3.0
 */
public enum UF {

	AC("Acre"),
	AL("Alagoas"),
	AM("Amazonas"),
	AP("Amapá"),
	BA("Bahia"),
	CE("Ceará"),
	DF("Distrito Federal"),
	ES("Espírito Santo"),
	GO("Goiás"),
	MA("Maranhão"),
	MG("Minas Gerais"),
	MS("Mato Grosso do Sul"),
	MT("Mato Grosso"),
	PA("Pará"),
	PB("Paraíba"),
	PE("Pernambuco"),
	PI("Piauí"),
	PR("Paraná"),
	RJ("Rio de Janeiro"),
	RN("Rio Grande do Norte"),
	RO("Rondônia"),
	RR("Roraima"),
	RS("Rio Grande do Sul"),
	SC("Santa Catarina"),
	SE("Sergipe"),
	SP("São Paulo"),
	TO("Tocantins");

	private final String descricao;

	UF(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

