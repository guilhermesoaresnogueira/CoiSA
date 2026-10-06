/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20260014800
 * @author Guilherme Soares Nogueira
 */




package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void adicionaTempoOnline(int tempoOnline) {
        this.tempoOnline += tempoOnline;
    }

    public boolean atingiuMetaTempoOnline () {
        return tempoOnline >= tempoOnlineEsperado;
    }

    @Override
    public String toString () {
        return "RegistroTempoOnline{" +
                "tempoOnline=" + tempoOnline +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", tempoOnlineEsperado=" + tempoOnlineEsperado +
                '}';
        }
}
