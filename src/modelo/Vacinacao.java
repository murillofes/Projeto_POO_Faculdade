package modelo;

public class Vacinacao {
    private int id;
    private Animal animal;
    private Vacina vacina;
    private String data;

    public Vacinacao(int id, Animal animal, Vacina vacina, String data) {
        this.id = id;
        this.animal = animal;
        this.vacina = vacina;
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Vacina getVacina() {
        return vacina;
    }

    @Override
    public String toString() {
        return data + " - " + animal.getNome() + " recebeu " + vacina.getNome();
    }
}