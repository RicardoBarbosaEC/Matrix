import javax.swing.JOptionPane;

public class Principal {

	// criado ol� mundo
	
	static String nomePessoa;

	public static void main(String[] args) {

		nomePessoa = digiteSeuNome();
		mostrarAvisoNaTela();

	}

	public static void mostrarAvisoNaTela() {
		
		JOptionPane.showMessageDialog(null, "Ol� Mundo - " + nomePessoa);

	}

	public static String digiteSeuNome() {
		
	
		return JOptionPane.showInputDialog("Digite o Seu Nome");

	}
}