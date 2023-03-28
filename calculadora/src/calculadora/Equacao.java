package calculadora;


public class Equacao {

	private double operando1;
	private double operando2;
	private String operador;
	private double resultado;

	public Equacao() {
		getResultado();
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando1() {
		return operando1;
	}

	public void calculaResultado() {
		double r = 0.0;
		
		if (this.operador.equals("+"))
			r = operando1 + operando2;
		
		else if (this.operador.equals("-"))
			r = operando1 - operando2;
		
		else if (this.operador.equals("*"))
			r = operando1 * operando2;
		
		else if (this.operador.equals("/"))
			r = operando1 / operando2;
		
		else
			System.out.println("Operador invalido!!");

		setResultado(r);
	}

}
