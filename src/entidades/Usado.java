package entidades;

import enums.Situacao;

public class Usado extends Imovel{

	private  Situacao atualSituacao;

	public Usado(String nome, String endereco, double area, double valor, double mostraValorVenda,
			Situacao atualSituacao) {
		super(nome, endereco, area, valor);
		this.atualSituacao = atualSituacao;
		
	}


	public Situacao getAtualSituacao() {
		return atualSituacao;
	}

	public void setAtualSituacao(Situacao atualSituacao) {
		this.atualSituacao = atualSituacao;
	}
	public double mostraValorVenda() {
		return super.getValor()*0.9;
		
	}


	@Override
	public String toString() {
		return "Usado AtualSituacao=" + atualSituacao 
				+ ", mostraValorVenda()=" + mostraValorVenda() 
				+ ", toString()="+ super.toString() + ".";
	}


}
