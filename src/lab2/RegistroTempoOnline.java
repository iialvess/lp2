package lab2;

public class RegistroTempoOnline {

    int tempoEsperado;
    String nomeDisciplina;
    int tempoInvestidoOnline;

    public RegistroTempoOnline(int tempoEsperado, String nomeDisciplina) {
        this.tempoEsperado = tempoEsperado;
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
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
