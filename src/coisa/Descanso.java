package coisa;

public class Descanso {
    private int horasDeDescanso;
    private int numeroDeSemana;


    public Descanso() {
        this.horasDeDescanso = 0;
        this.numeroDeSemana = 0;
    }

    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroDeSemana = valor;
    }


    public String getStatusGeral() {
        if (this.numeroDeSemana <= 0) {
            return "cansado";
        }

        int media = this.horasDeDescanso / this.numeroDeSemana;

        if (media >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}