package br.com.argonavis.javaee7.jsf.el;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("cinemateca")
@ApplicationScoped
public class CinematecaBean {
	
	private String nome = "Cinemateca II";

	private Filme[] filmes = new Filme[] {
			new Filme("tt0062622", "2001: A Space Odyssey", "Stanley Kubrick", 1968, 160),
			new Filme("tt0013442", "Nosferatu, eine Symphonie des Grauens", "F. W. Murnau", 1922, 81),
			new Filme("tt1937390", "Nymphomaniac", "Lars von Trier", 2013, 330),
			new Filme("tt1527186", "Melancolia", "Lars von Trier", 2011, 136),
			new Filme("tt0113083", "La Flor de mi Secreto", "Pedro Almodovar", 1995, 103),
			new Filme("tt0101765", "La double vie de Véronique", "Krzysztof Kieslowski", 1991, 98)
	};

	public Filme[] getFilmes() {
		return filmes;
	}

	public void setFilmes(Filme[] filmes) {
		this.filmes = filmes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int duracaoTotal() {
		int durTotal = 0;
		for(Filme f : filmes) {
			durTotal += f.getDuracao();
		}
		return durTotal;
	}
	
	public int duracao(int filmeIdx) {
		return filmes[filmeIdx].getDuracao();
	}
	
	public Map<String, Object> getSessionMap() {
		return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	}

}
