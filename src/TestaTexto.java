
import javax.swing.JOptionPane;

public class TestaTexto {
	
	public static void main(String[] args) {
		
		// JOptionPane.showInputDialog() -> entrada de dados grafica(window)
		String texto = JOptionPane.showInputDialog("Forneca o texto: ");
		
		Texto txt = new Texto(texto);
		
		String saida = "Texto original: " + txt.getTexto() + " (quantidade de palavras: " + txt.qtdPalavras() + ")"+ "\n" + "Texto invertido : " + txt.inverterTexto() ;	
		
		// JOptionPane.showMessageDialog() -> saida de dados grafica
		JOptionPane.showMessageDialog(null, saida);
	}
}
