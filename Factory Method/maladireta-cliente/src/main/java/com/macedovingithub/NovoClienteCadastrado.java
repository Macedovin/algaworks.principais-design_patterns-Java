package com.macedovingithub;

import javax.swing.JOptionPane;

import com.macedovingithub.maladireta.xml.MalaDiretaXML;
import com.macedovingithub.maladireta.MalaDireta;

public class NovoClienteCadastrado {

	public static void main(String[] args) {
		
	    // Objeto que "gera" a LISTA DE CONTATOS 
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
	    
	    String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");
	    
	    // Método só recebe a mensagem, sem tomar conhecimento do arquivo de contatos 
	    boolean status = malaDireta.enviarEmail(mensagem);
	    
	    JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
    }
	
}
