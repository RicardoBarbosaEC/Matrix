
public class Moto {
	//Attributes

	private String Marca;
	private boolean ligado;
	private int velocidade;
	private int marcha;

	//Construtores sem valor e com valor

	public Moto(String marca, boolean ligado, int velocidade, int marcha) {

		Marca = marca;
		this.ligado = ligado;
		this.velocidade = velocidade;
		this.marcha = marcha;

	}

	//getters e setters

	public Moto() {

	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
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

	//Métodos do Sistema feito pelo aluno

	public void ligarMoto() {
		if(this.ligado==true) {
			System.out.println("A Moto está Ligada");
		}else {
			System.out.println("A Moto está Desligada");
		}
	}

}

