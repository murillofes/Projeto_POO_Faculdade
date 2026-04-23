package serviço;

import modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Animal> animais = new ArrayList<>();
    private List<Vacina> vacinas = new ArrayList<>();
    private List<Vacinacao> vacinacoes = new ArrayList<>();

    private int idAnimal = 1;
    private int idVacina = 1;
    private int idVacinacao = 1;

    public void cadastrarAnimal(String nome, String especie, int idade) {
        Animal animal = new Animal(idAnimal++, nome, especie, idade);
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal a : animais) {
            System.out.println(a);
        }
    }

    public void cadastrarVacina(String nome, String descricao) {
        Vacina vacina = new Vacina(idVacina++, nome, descricao);
        vacinas.add(vacina);
    }

    public void listarVacinas() {
        for (Vacina v : vacinas) {
            System.out.println(v);
        }
    }

    public void registrarVacinacao(int idAnimal, int idVacina, String data) {
        Animal animal = null;
        Vacina vacina = null;

        for (Animal a : animais) {
            if (a.getId() == idAnimal) {
                animal = a;
            }
        }

        for (Vacina v : vacinas) {
            if (v.getId() == idVacina) {
                vacina = v;
            }
        }

        if (animal != null && vacina != null) {
            Vacinacao vacinacao = new Vacinacao(idVacinacao++, animal, vacina, data);
            vacinacoes.add(vacinacao);
            System.out.println("Vacinação registrada!");
        } else {
            System.out.println("Animal ou vacina não encontrado.");
        }
    }

    public void historicoAnimal(int idAnimal) {
        for (Vacinacao v : vacinacoes) {
            if (v.getAnimal().getId() == idAnimal) {
                System.out.println(v);
            }
        }
    }
}