package canetagettersetter;

public class Caneta {
	
	private String modelo;
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public Caneta(String modelo,String cor,double ponta){
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
		this.setCarga(10);
		this.setTampada(true);
		System.out.println("Caneta criada:");
		System.out.println("Modelo: " + this.getCor());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Carga: " + this.getCarga());
		System.out.println("Tampada: " + this.isTampada());
	}
	
	void escrever() {
		if(this.isTampada() == false) {
			System.out.println("Estou escrevendo");
		}else {
			System.out.println("Estou tampada não posso escrever");
		}
	};
	
	void rabiscar() {
		if(this.isTampada() == false) {
			System.out.println("Estou rabiscando");
		}else {
			System.out.println("Estou tampada não posso rabiscar");
		}
	}
	
	void pintar() {
		if(this.isTampada() == false) {
			System.out.println("Estou pintando");
		}else {
			System.out.println("Estou tampada não posso pintar");
		}
	}
	
	void tampar() {
		this.setTampada(true);
		System.out.println("Tampada");
	}

	void destampar() {
		this.setTampada(false);
		System.out.println("destampada");
	}

}
