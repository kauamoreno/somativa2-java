package avaliacao_somativa2;

import java.util.Scanner;

public class Vendedores {

	Scanner ler = new Scanner(System.in);
	
	
	private String[] id = {"001","002","003"}; 
	private String[] nomes = {"Jamil do Frete","Marco Antonio","Lucas Sidney"};
	private double[] totalVendido = {0,0,0};
	
	
	/**************************************************************************************/
	public void vendaRealizada() {
		for(;;) {
			System.out.println();
			System.out.println("1- Registrar nova compra");
			System.out.println("2- Sair");
			int resposta = ler.nextInt();
			
			//Caso a resposta seja "1- Registrar nova compra"
			if(resposta == 1) {
				ler.nextLine();
				
				System.out.println();
				System.out.print("--> ID do vendedor: ");
				String id = ler.nextLine();

				System.out.print("--> Nome do cliente: ");
				String nomeDoCliente = ler.nextLine();

				System.out.print("--> Produto: ");
				String nomeDoProduto = ler.nextLine();
				
				System.out.print("--> Quantidade: ");
				int quantidadeDoProduto = ler.nextInt();
				
				System.out.print("--> Valor do produto: ");
				double valorDoProduto = ler.nextDouble();
				
				double valorTotalDaCompra = valorDoProduto*quantidadeDoProduto;
				System.out.println("COMPRA CONFIRMADA NO VALOR DE " + valorTotalDaCompra);
				
				if(id.equals("001")) {
					totalVendido[0] += valorTotalDaCompra;
				}
				if(id.equals("002")) {
					totalVendido[1] += valorTotalDaCompra;
				}
				if(id.equals("003")) {
					totalVendido[2] += valorTotalDaCompra;
				}
			}
			
			//Caso a resposta seja "2- Sair"
			if(resposta == 2) {
				break;
			}
			
			//Caso seja colocado um numero que não corresponde a nenhum dos solicitados
			if(resposta != 1 & resposta != 2) {
				System.out.println();
				System.out.println("O valor digitado não corresponde aos valores acima");
			}
		}

	}
	/**************************************************************************************/
	
	
	/**************************************************************************************/
	public void vendedores() {
		System.out.println("--------------------------------");
		System.out.println("VENDEDOR 1");
		System.out.println("--> ID - " + id[0]);
		System.out.println("--> Nome - " + nomes[0]);
		
		System.out.println();
		System.out.println("VENDEDOR 2");
		System.out.println("--> ID - " + id[1]);
		System.out.println("--> Nome - " + nomes[1]);
		
		System.out.println();
		System.out.println("VENDEDOR 3");
		System.out.println("--> ID - " + id[2]);
		System.out.println("--> Nome - " + nomes[2]);
		System.out.println("--------------------------------");
	}
	/**************************************************************************************/
	
	
	/**************************************************************************************/
	public void relatorio() {
		System.out.println("--------------------------------");
		System.out.println("VENDEDOR 1");
		System.out.println("--> ID - " + id[0]);
		System.out.println("--> Nome - " + nomes[0]);
		System.out.println("--> Total Vendido - " + totalVendido[0]);
		
		System.out.println();
		System.out.println("VENDEDOR 2");
		System.out.println("--> ID - " + id[1]);
		System.out.println("--> Nome - " + nomes[1]);
		System.out.println("--> Total Vendido - " + totalVendido[1]);
		
		System.out.println();
		System.out.println("VENDEDOR 3");
		System.out.println("--> ID - " + id[2]);
		System.out.println("--> Nome - " + nomes[2]);
		System.out.println("--> Total Vendido - " + totalVendido[2]);
		System.out.println("--------------------------------");
	}
	/**************************************************************************************/
	
	
	/**************************************************************************************/
	public void metodosDisponiveis() {
		
		for(;;) {
			System.out.println();
			System.out.println("DIGITE O NÚMERO PARA SER LEVADO A AREA CORRESPONDENTE");
			System.out.println("--> 1- Venda Realizada");
			System.out.println("--> 2- Relatorio");
			System.out.println("--> 3- Vendedores");
			System.out.println("--> 4- Sair do sistema");
			
			int resposta = ler.nextInt();
			
			if(resposta == 1) {
				System.out.println();
				vendaRealizada();
			}
			if(resposta == 2) {
				System.out.println();
				vendedores();
			}
			if(resposta == 3) {
				System.out.println();
				relatorio();
			}
			if(resposta == 4) {
				break;
			}
			if(resposta != 1 & resposta != 2 & resposta != 3 & resposta != 4) {
				System.out.println();
				System.out.println("O valor digitado não corresponde aos valores acima");
				System.out.println();
				System.out.println("DIGITE O NÚMERO PARA SER LEVADO A AREA CORRESPONDENTE");
			}
		}

	}
	/**************************************************************************************/
	
	
	/*****************GETTERS AND SETTERS*****************/
	public String[] getId() {
		return id;
	}
	public void setId(String[] id) {
		this.id = id;
	}
	public String[] getNomes() {
		return nomes;
	}
	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}
	public double[] getTotalVendido() {
		return totalVendido;
	}
	public void setTotalVendido(double[] totalVendido) {
		this.totalVendido = totalVendido;
	}
	/*****************************************************/
	
}
