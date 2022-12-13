package avaliacao_somativa2;

import java.util.Scanner;

public class Gerente extends VendedorDoAno{

	Scanner ler = new Scanner(System.in);
	
	private int senha = 123;
	
	public boolean senhaDeAcesso() {
		int senhaDeAcesso;
		
		for(;;) {
			System.out.print("Digite a senha de acesso: ");
			senhaDeAcesso = ler.nextInt();
			
			if(this.senha == senhaDeAcesso) {
				super.relatoriosDisponiveis();
				return true;
			}else {
				System.out.println("Senha incorreta");
				System.out.println();
				senhaDeAcesso();
				return false;
			}
			
		}
		
	}
}
