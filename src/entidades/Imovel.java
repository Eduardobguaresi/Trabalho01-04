package entidades;

public class Imovel {
private String proprietario;
private String endereco;
private double area;
private double valor;

	public Imovel() {	
	}

	public Imovel(String proprietario, String endereco, double area, double valor) {
		super();
		this.proprietario = proprietario;
		this.endereco = endereco;
		this.area = area;
		this.valor = valor;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Imovel Proprietario=" + proprietario 
				+ ", endereco=" + endereco 
				+ ", area=" + area 
				+ ", valor=" + valor
				+ ", toString()=" + super.toString() + "]";
	}

	
}
