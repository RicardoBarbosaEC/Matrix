
public class Carro {
	//Atributos
	private String marca;
	private boolean ligado;
	private int  velocidade;
	private int marcha;

	//Construtores sem valor e com valor

	public Carro(String marca, boolean ligado, int velocidade, int marcha) {

		this.marca = marca;
		this.ligado = ligado;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}


	//Getters e Setters

	public Carro() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	//Metodos do Sistema, feitos pelo aluno.

	public void ligarCarro() {

		if(this.ligado== true) {
			System.out.println("O Carro est� Ligado");
		}else {
			System.out.println("O carro est� Desligado");

		}
	}
}
