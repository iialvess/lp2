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
        // Cria a instância do objeto Resumo (Composição)
        this.totalResumos[proximaPosicao] = new Resumo(tema, conteudo);

        if (this.quantidadeAtual < this.numeroDeResumos) {
            this.quantidadeAtual++;
        }

        // Incremento circular para substituir o mais antigo ao atingir o limite
        this.proximaPosicao = (this.proximaPosicao + 1) % this.numeroDeResumos;
    }

    // Sobrecarga para suportar o nome de método "adicionaResumo" se necessário
    public void adicionaResumo(String tema, String conteudo) {
        this.adiciona(tema, conteudo);
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
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(this.quantidadeAtual).append(" resumo(s) cadastrado(s)\n");
        sb.append("- ");

        for (int i = 0; i < this.quantidadeAtual; i++) {
            sb.append(this.totalResumos[i].getTema());
            if (i < this.quantidadeAtual - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.totalResumos[i] != null && this.totalResumos[i].getTema().equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }
}