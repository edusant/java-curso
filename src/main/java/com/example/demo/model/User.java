package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

import javax.persistence.GeneratedValue;

import lombok.Data;

@Data
@Entity
@Table(name="usuario")

public class User  implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private UUID id;
		@Column(nullable = false )
		
		private String nome;
		@Column(nullable = false )
		private String sobreNome;
		@Column(nullable = false )
		private String idade;
		
		@Column(nullable = false, unique=true )
		private String email;
		
		@Column(nullable = false)
		private String password;
		
}
