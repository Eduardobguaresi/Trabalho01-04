package entidades;

public class Novo extends Imovel{
 private String data;

	public Novo(String nome, String endereco, double area, double valor, String data) {
	super(nome, endereco, area, valor);
	this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double mostraValorVenda() {
		return super.getValor()*1.1;
	}

	@Override
	public String toString() {
		return "Novo Data=" + data 
				+ ", toString()="
				+ super.toString() + ".";
	}
	
}
