package com.example.openapiapp.communication.dto

import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.media.Schema

import javax.validation.constraints.NotNull

@CompileStatic
@Schema(
		name = 'PessoaJuridica',
		allOf = [EntidadeDto]
)
class PessoaJuridicaDto extends EntidadeDto {

	String razaoSocial

	String nomeFantasia

	String CNPJ

	UF uf

}
