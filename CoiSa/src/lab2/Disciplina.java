/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20260014800
 *
 * @author Guilherme Soares Nogueira
 */



package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }
    public void cadastraNota( int numeroNota, double valorNota) {
        this.notas[numeroNota - 1] = valorNota;

    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += this.horasEstudo + horas;
    }
    private double calculaMedia() {
        double soma = 0;
        for (int i = 0; i <  this.notas.length; i++) {
            soma = soma + this.notas[i];
        }
        return soma / this.notas.length;
    }
    public boolean aprovado() {
        return this.calculaMedia() >= 7.0;
    }
    public String tostring() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.calculaMedia() + " " + Arrays.toString(this.notas);
    }
}

