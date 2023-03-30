import java.util.Scanner;

public class Aplicacao {

    public static void main(String args[]) {
        CadastroAlunos cad = new CadastroAlunos(60);
        
        Scanner scanner = new Scanner(System.in);
        String opcao;
        
        do {
        	System.out.println("Digite a opcao que deseja: \n");
        	System.out.println("(I)nserir\n(R)emover\n");
        	opcao = scanner.next();
        }while(opcao == "I" || opcao == "R");
        
        Aluno.menu(opcao);
    }
}
