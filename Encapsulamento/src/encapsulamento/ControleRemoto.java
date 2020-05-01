package encapsulamento;

public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		if(this.isLigado() == false) {
			this.setLigado(true);
			System.out.println("Aparelho ligado");
		}else {
			System.out.println("Aparelho já estava ligado");
		}
	}

	@Override
	public void desligar() {
		if(this.isLigado() == true) {
			this.setLigado(false);
			System.out.println("Aparelho desligado");
		}else {
			System.out.println("Aparelho já estava desligado");
		}
	}

	@Override
	public void abrirMenu() {
		if(this.isLigado()) {
			System.out.println("Menu aberto");
			System.out.println("Volume: " + this.getVolume());
			System.out.println("Está tocando: " + this.isTocando());
		}else {
			System.out.println("Aparelho não está ligado, portando menu não aberto");
		}
	}

	@Override
	public void fecharMenu() {
		if(this.isLigado()){
			System.out.println("Menu Fechado");
		}else {
			System.out.println("Aparelho não está ligado, portando não da para fechar o menu");
		}
		
	}

	@Override
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(getVolume() + 10);
			System.out.println("volume aumentado");
		} else {
			System.out.println("Aparelho não está ligado");
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(getVolume() - 10);
			System.out.println("volume diminuido");
		} else {
			System.out.println("Aparelho não está ligado");
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("volume ficou no mudo");
		} else {
			System.out.println("Aparelho não está ligado");
		}
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
			System.out.println("volume saiu do mudo");
		} else {
			System.out.println("Aparelho não está ligado");
		}
		
	}

	@Override
	public void play() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
			System.out.println("Aparelho está tocando");
		} else {
			System.out.println("Aparelho não está ligado");
		}
		
	}
	
	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()) {
			this.setTocando(false);
			System.out.println("aparelho parou de tocar");
		} else {
			System.out.println("Aparelho não está ligado");
		}
	}

}
