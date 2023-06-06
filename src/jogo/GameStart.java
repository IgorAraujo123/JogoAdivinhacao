package jogo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameStart {
	
	Definicao def = new Definicao();
	Scanner s = new Scanner(System.in);
	
	public void start() {
		
		int numeroSorteado = def.gerarNumero();
		int tentativas = 10;
		int Resposta = 0;
		
		Thread thread = new Thread();
				
		def.titulo();
		
		System.out.println(numeroSorteado);
		
		thread.start();
		
		while(true) {
			
			try {
				System.out.println("Digite um numero de 0 a 50");
				int numeroUsuario = s.nextInt();
			
				Thread.sleep(1000);
				
				boolean regJogo = def.regrasJogo(numeroUsuario, numeroSorteado);
				
				if(regJogo) {			
					
					System.out.println("Deseja continuar no jogo? [1 - Sim /2 - Não]");
				    Resposta = s.nextInt();
				    					
					if(Resposta == 1) {
						def.limparJanela();
						start();
					}else if(Resposta == 2){
						break;
					}else {
						break;
					}
				}else if(tentativas <= 0) {
					System.out.println(Resposta);
					break;
				}else {
					tentativas -= 1;
					System.out.printf("Suas tentativas são %d\n", tentativas);
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println(e);
			}catch (InterruptedException e2) {
				System.out.println(e2);
			}
				
		}
	}

}
