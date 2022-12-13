package avaliacao_somativa2;

public class Vendedores {

	private String[] id = {"001","002","003"}; 
	private String[] nomes = {"Jamil do Frete","Marco Antonio","Lucas Sidney"};
	private double[] totalVendido = {0,0,0};
	
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
