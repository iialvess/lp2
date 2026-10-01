package lab2;

public class RegistroTempoOnline {

    private int tempoEsperado;
    private String nomeDisciplina;
    private int tempoInvestidoOnline;

    public RegistroTempoOnline(String nomeDisciplina,int tempoEsperado) {
        this.tempoEsperado = tempoEsperado;
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
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