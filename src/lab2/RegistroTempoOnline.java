package lab2;

public class RegistroTempoOnline {

    private int tempoEsperado;
    private String nomeDisciplina;
    private int tempoInvestidoOnline;

    public RegistroTempoOnline(int tempoEsperado, String nomeDisciplina) {
        this.tempoEsperado = tempoEsperado;
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this(120, nomeDisciplina);
    }
    public void adicionaTempoOnline(int valor){
        tempoInvestidoOnline += valor;
    }
    public boolean atingiuMetaTempoOnline(){
        return tempoInvestidoOnline >= tempoEsperado;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoInvestidoOnline + "/" + tempoEsperado;
    }
}