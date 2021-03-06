package br.com.argonavis.javaee7.jpa.intro.web;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Livro implements Serializable {

	@Id
	@SequenceGenerator(name="livro_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="livro_id_seq")
	private Long id;
	private String titulo;
	private int paginas;
	private static final long serialVersionUID = 1L;

	public Livro() {
		super();
	}   
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}   
	public int getPaginas() {
		return this.paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
}
