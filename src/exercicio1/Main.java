package exercicio1;


import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Animais animal = new Animais();


        System.out.println(animal.pegaOBixo(1));


        animal.fazerAposta(new int[] {5, 4, 4, 8, 19});
        animal.imprimeAposta(animal.getBilhete(), animal.getAnimais());
        System.out.println("");
        animal.fazerApostaAleatoria();

        animal.imprimeAposta(animal.getBilhete(), animal.getAnimais());


    }
}