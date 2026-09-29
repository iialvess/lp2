package lab2;

public class Disciplina {
    String nomeDisciplina;
    int horasDeEstudo;
    double notas1;
    double notas2;
    double notas3;
    double notas4;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }


}
