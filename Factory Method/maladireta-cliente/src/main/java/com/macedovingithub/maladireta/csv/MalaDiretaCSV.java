package com.macedovingithub.maladireta.csv;

import com.macedovingithub.contato.Contatos;
import com.macedovingithub.maladireta.MalaDireta;

public class MalaDiretaCSV extends MalaDireta {

	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected Contatos criarContatos() {
	    return new ContatosCSV(nomeArquivo);
    }

}
