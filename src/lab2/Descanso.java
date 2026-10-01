package lab2;

public class Descanso {
    private int horasDeDescanso;
    private int numeroDeSemana;

    public Descanso() {
        this.horasDeDescanso = 0;
        this.numeroDeSemana = 1;
    }

    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }


    public void defineNumeroSemanas(int valor) {
        this.numeroDeSemana = valor;
    }


    public String getStatusGeral() {
        if (this.numeroDeSemana == 0) {
            return "cansado";
        }

        int mediaHorasPorSemana = this.horasDeDescanso / this.numeroDeSemana;

        if (mediaHorasPorSemana >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}