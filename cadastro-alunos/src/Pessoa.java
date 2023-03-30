

public class Pessoa {
	// variaveis de instancia 
    private int idade;
    private NomePessoa nome;
    
    public Pessoa(String nome, int idade) {
        setNome(new NomePessoa(nome)); 
        setIdade(idade);
    }

    private void setNome(NomePessoa nome){
        this.nome = nome;
    }

    private void setIdade(int idade){
        this.idade = idade;
    }

    private NomePessoa getNome(){
        return this.nome;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    public String toString(){
        return ("Nome: " + getNome() + "\nIdade: " + getIdade());
    }   
}