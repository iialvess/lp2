package exercicio1;


import java.util.Arrays;
public class Main {
    public static void main() {
        Animais animal = new Animais();
        animal.setBilhete(new int[]{12,13,1,5,8});

        System.out.println(animal.pegaOBixo(1));
        System.out.println(Arrays.toString(animal.getBilhete()));
    }
}
