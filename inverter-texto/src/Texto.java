
public class Texto {

	private String texto;

	// metodo construtor
	public Texto(String txt) {
		setTexto(txt);
		limpaEspacosExcedentes();
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}

	// retornando o texto invertido
	public String inverterTexto() {
		String txtInvertido = "";
		if (!(this.texto == null || this.texto.equals(""))) {

			for (int i = this.texto.length() - 1; i >= 0; i--) {
				txtInvertido = txtInvertido + this.texto.charAt(i);
				
			}
		} else {
			return null;
		}

		return txtInvertido;
	}
	
	public void limpaEspacosExcedentes() {
		
		setTexto(this.texto.trim()); // Elimina espacos no inicio e no fim da String
		
		String txtSemEspacos = "";
		for(int i = 0; i < this.texto.length(); i++) {
			
			txtSemEspacos = txtSemEspacos + this.texto.charAt(i);
			if(this.texto.charAt(i) == ' ') {
				while(this.texto.charAt(i+1) == ' ') {
					i++;
				}
			}
		}
		setTexto(txtSemEspacos);
	}
	
	// retornando a quantidade de palavras da string 
	public int qtdPalavras() {
		return (this.texto.split(" ").length);
	}
}
//JOptionPane.showInputDialog
//JOptionPane.showMessageDialog
//charAt
//trim()
//split();