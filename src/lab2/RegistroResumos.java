package lab2;

public class RegistroResumos {
    private Resumo[] totalResumos;
    private int numeroDeResumos; // Capacidade máxima
    private int quantidadeAtual;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.totalResumos = new Resumo[numeroDeResumos];
        this.quantidadeAtual = 0;
        this.proximaPosicao = 0;
    }
    public void adiciona(String tema, String conteudo) {
        if (this.quantidadeAtual < this.numeroDeResumos) {
            this.totalResumos[this.quantidadeAtual] = new Resumo(tema, conteudo);
            this.quantidadeAtual++;
        }
    }

    public String[] pegaResumos() {
        String[] copiaResumos = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            copiaResumos[i] = this.totalResumos[i].toString();
        }
        return copiaResumos;
    }

    public int conta() {
        return this.quantidadeAtual;
    }

    public int contaResumos() {
        return this.conta();
    }

    public String imprimeResumos() {
        int qntdResumos = this.conta();
        String impressao = "- " + qntdResumos + " resumo(s) cadastrado(s)\n-";

        for (int i = 0; i < qntdResumos; i++) {
            if (i != qntdResumos - 1) {
                impressao += " " + this.totalResumos[i].getTema() + " |";
            } else {
                impressao += " " + this.totalResumos[i].getTema();
            }
        }
        return impressao;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.totalResumos[i] != null && this.totalResumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}