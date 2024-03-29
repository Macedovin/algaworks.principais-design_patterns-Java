package com.macedovingithub.maladireta.xml;

import com.macedovingithub.contato.Contatos;
import com.macedovingithub.maladireta.MalaDireta;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected Contatos criarContatos() {
	    return new ContatosXML(nomeArquivo);
    }

}
