package exercicio1;

import java.util.Arrays;

public class Animais {
    private String[] animais= {
            "Avestruz",
            "Águia",
            "Burro",
            "Borboleta",
            "Cachorro",
            "Cabra",
            "Carneiro",
            "Camelo",
            "Cobra",
            "Coelho",
            "Cavalo",
            "Elefante",
            "Galo",
            "Gato",
            "Jacaré",
            "Leão",
            "Macaco",
            "Porco",
            "Pavão",
            "Peru",
            "Touro",
            "Tigre",
            "Urso",
            "Veado",
            "Vaca"
    };

    int[] bilhete = new int[5];


    public String[] getAnimais() {
        return animais;
    }

    public void setAnimais(String[] animais) {
        this.animais = animais;
    }

    public int[] getBilhete() {
        return bilhete;
    }

    public void setBilhete(int[] bilhete) {
        this.bilhete = bilhete;
    }

    public String pegaOBixo(int numero){

        int indice = numero - 1;
        if (indice >= 0 && indice <= 24){

            return animais[indice];
        } else {
            return "NÚMERO DE ANIMAL INVALIDO";

        }
    }






}
