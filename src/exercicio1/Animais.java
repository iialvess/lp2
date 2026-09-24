package exercicio1;

import java.util.Arrays;
import java.util.Random;

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

    int[] bilhete;

    public Animais(){

    }

    public String[] getAnimais() {
        return animais;
    }

    public void setAnimais(String[] animais) {
        this.animais = animais;
    }

    public int[] getBilhete() {
        return bilhete;
    }

    public String pegaOBixo(int numero){

        int indice = numero - 1;
        if (indice >= 0 && indice <= 24){

            return animais[indice];
        } else {
            return "NÚMERO DE ANIMAL INVALIDO";

        }
    }

    public void fazerAposta(int[] bilhete){
        this.bilhete = bilhete;
    }

    public void fazerApostaAleatoria(){
        Random random = new Random();
        for (int i =0; i < 5; i++){
            bilhete[i] = random.nextInt(26);
        }

    }

    public void imprimeAposta(int[] aposta, String[] animais) {
        Arrays.sort(aposta);
        String impressos = "";

        for (int i = 0; i < aposta.length; i++) {
            int indice = aposta[i] - 1;
            String animal = animais[indice];

            if (!impressos.contains(animal)) {
                System.out.print(animal + " ");
                impressos += animal + " ";
            }
        }
    }


}