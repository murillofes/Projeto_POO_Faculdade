package modelo;

public class Animal {
    private int id;
    private String nome;
    private String especie;
    private int idade;

    public Animal(int id, String nome, String especie, int idade) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " (" + especie + ", " + idade + " anos)";
    }
}