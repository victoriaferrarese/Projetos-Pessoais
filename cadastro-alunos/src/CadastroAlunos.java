import java.util.Scanner;

public class CadastroAlunos {
	
	private Aluno cadastrados[];
	
	public CadastroAlunos(int qtd) {
		cadastrados = new Aluno[qtd];
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digite a opcao que dejesa: " + "\n" + "(I)nserir\n" + "(R)emover\n" + "(L)istar\n" + "(S)air");
		Scanner scanner = new Scanner(System.in);
	    String opcao = scanner.next();    
	 
	    switch(opcao){
		    
		 	case "I":
		 		 System.out.println("ok");
		 		break;
		 		
		 	case "R": 
		 		break;
		 		
		 	case "L":
		 		//listar
		 		break;
		 	case "S":
		 		//sair
		 		break;
			
		}
	    
	
		
		//JOptionPane.showInputDialog("Digite a opcao que dejesa: " + "\n" + "(I)nserir\n" + "(R)emover\n" + "(L)istar\n" + "(S)air");
	    	 
	}
	
	
}

	
