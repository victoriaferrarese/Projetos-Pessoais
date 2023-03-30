
public class Aluno extends Pessoa {
	
    String ra;
    int serie;
    Disciplina disc[];
 
    Aluno(String nome, int idade, String ra, int serie, Disciplina disc[]){
        super (nome, idade);
        setRa(ra);
        setSerie(serie);
        setDisc(disc);
    }
    
    private void setRa(String ra){
        this.ra = ra;
    }
    
    private void setSerie(int serie){
        this.serie = serie;
    }
    
    private void setDisc(Disciplina disc[]){
        this.disc = disc;
    }
    
    public static void menu(String opcao) {
    	
    	switch(opcao) {
    		case "I":
    			System.out.println("Inserindo..."); //**********************
    			break;
    		
    	}
    }
}

