/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20260014800
 *
 * @author Guilherme Soares Nogueira
 */



package lab2;

public class RegistroResumos {
    private int numeroDeResumos;
    private String[] temas;
    private String[] conteudos;
    private int quantidadeAtual;

    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidadeAtual = 0;
    }

    public void adiciona(String tema, String conteudo) {
        this.temas[this.quantidadeAtual] = tema;
        this.conteudos[this.quantidadeAtual] = conteudo;
        this.quantidadeAtual = this.quantidadeAtual + 1;

    }

    public String[] pegaResumos() {
        String[] resumos = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resumos[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resumos;

    }

    public int conta() {
        return this.quantidadeAtual;
    }

    public String imprimeResumos() {
        String texto = "";
        for (int i = 0; i < this.quantidadeAtual; i++) {
            texto = texto + this.temas[i] + ": " + this.conteudos[i];
            if (i < this.quantidadeAtual - 1) {
                texto = texto + " | ";
            }
        }
        return texto;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
