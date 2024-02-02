package com.macedovingithub;

import javax.swing.JOptionPane;

import com.macedovingithub.maladireta.MalaDireta;
import com.macedovingithub.maladireta.csv.MalaDiretaCSV;

public class RelacionamentoCliente {

	public static void main(String[] args) {
		
		// Objeto que realiza o processo de obter os Contatos
	    MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
	    
	    String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
	    
	    // Método não precisa saber da origem dos Contatos (arquivo)
	    boolean status = malaDireta.enviarEmail(mensagem);
	    
	    JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
	
}
