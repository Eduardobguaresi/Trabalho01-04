package enums;

public enum Situacao {
	DESOCUPADO (1, "Desocupado"),
	OCUPADO (2, "Ocupado"),
	EM_REFORMA(3, "Em reforma");
	
	private int estado;
	private String situacao;
	
	private Situacao(int estado, String situacao) {
		this.estado = estado;
		this.situacao = situacao;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	
}
