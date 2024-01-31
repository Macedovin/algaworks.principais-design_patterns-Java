package com.macedovingithub;

import javax.swing.JOptionPane;

import com.macedovingithub.maladireta.MalaDireta;

public class Principal {

	public static void main(String[] args) {
		// Instancia um objeto que envia e-mails 
		MalaDireta malaDireta = new MalaDireta();
		// Recebe do usuário a mensagem conteúdo do e-mail  
	    String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail");
	    
	    // Envia o e-mail
	    boolean status = malaDireta.enviarEmail("contatos.csv", mensagem);
	    System.out.println(status);
    }
	
}
