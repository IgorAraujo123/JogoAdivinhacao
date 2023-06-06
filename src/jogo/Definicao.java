package jogo;

import java.util.Random;
import java.util.Scanner;

public class Definicao {
	
	Random rand = new Random();
	Scanner s = new Scanner(System.in);

	public int gerarNumero() {
		int numero = 0 + rand.nextInt(50);
		return numero;
	}
	
	public void titulo() {
		System.out.println("Bem Vindo ao jogo de adivição!!!\n");
	}
	
	public void limparJanela() {
		try {
	        final String os = System.getProperty("os.name");
	        
	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	        
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public boolean regrasJogo(int numeroUsuario, int numeroSorteado) {
		if(numeroUsuario < 0 || numeroUsuario > 50) {
	        System.out.printf("Numero %d é maior que 50 ou menor que 0", numeroUsuario);
	        return false;
		}
	    else if(numeroUsuario > numeroSorteado) {
	        System.out.printf("Numero %d é maior que o numero sorteado", numeroUsuario);
	        return false;
	    }
	    else if(numeroUsuario < numeroSorteado){
	    	System.out.printf("Numero %d é menor que o numero sorteado", numeroUsuario);
	        return false;
	    }
	    else if(numeroUsuario == numeroSorteado){
	    	System.out.printf(
	            "Numero %d é igual ao numero sorteado %d", numeroUsuario, numeroSorteado);
	        return true;
	    }
	    else 
	    {
			return false;
	    }
	}
}
