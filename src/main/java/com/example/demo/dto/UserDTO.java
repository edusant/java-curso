package com.example.demo.dto;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data

public class UserDTO {

	@NotBlank
	
	private String nome;
	@NotBlank
	private String sobreNome;
	@NotBlank
	private String idade;
	
	@NotBlank
	private String email;
	@NotBlank
	private String password;
}
