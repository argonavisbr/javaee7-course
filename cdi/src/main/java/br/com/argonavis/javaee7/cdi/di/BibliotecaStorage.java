package br.com.argonavis.javaee7.cdi.di;

import br.com.argonavis.javaee7.cdi.Livro;

public interface BibliotecaStorage {
	void atualizarStatus(Livro livro);
}