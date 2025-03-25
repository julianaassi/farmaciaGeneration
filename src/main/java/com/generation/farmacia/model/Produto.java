package com.generation.farmacia.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


	@Entity 
	@Table(name = "tb_produtos")
	public class Produto {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo é obrigatório")
		@Size(min = 3, max = 100, message = "O nome tem que ser maior que 3 e menor que 100")
		private String nome;
		
		@NotBlank(message = "O atributo descrição é obrigatório")
		@Size(min = 5, max = 1000, message = "A descrição tem que ser maior que 5 e menor que 1000")
		private String descricao;
		
		 @NotNull(message = "O atributo preço é obrigatório")
		    private Float preco;
		 
		 @NotBlank (message = "O atributo data de validade é obrigatório")
		 @NotNull
		  private String data_validade;
		 
		 @ManyToOne
		 @JsonIgnoreProperties("produto")
		 private Categoria categoria;
		 

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Float getPreco() {
			return preco;
		}

		public void setPreco(Float preco) {
			this.preco = preco;
		}

		public String getData_validade() {
			return data_validade;
		}

		public void setData_validade(String data_validade) {
			this.data_validade = data_validade;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		 
		
}
