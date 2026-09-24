package coisa;

public class Main {
    public static void main(String[] args) {
        Descanso d1 = new Descanso();

        d1.defineHorasDescanso(30);

        d1.defineNumeroSemanas(1);

        System.out.println(d1.getStatusGeral());

        d1.defineHorasDescanso(26);

        d1.defineNumeroSemanas(2);

        System.out.println(d1.getStatusGeral());
    }
}