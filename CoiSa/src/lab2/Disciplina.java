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
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4);
    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas) {
        this(nomeDisciplina, numeroDeNotas, criaPesosIguais(numeroDeNotas));
    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numeroDeNotas];
        this.pesos = pesos;
    }

    private static int[] criaPesosIguais(int quantidade) {
        int[] pesosIguais = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            pesosIguais[i] = 1;
        }
        return pesosIguais;
    }

    public void cadastraNota(int numeroNota, double valorNota) {
        this.notas[numeroNota - 1] = valorNota;

    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    private double calculaMedia() {
        double somaPonderada = 0;
        int somaDosPesos = 0;
        for (int i = 0; i < this.notas.length; i++) {
            somaPonderada = somaPonderada + this.notas[i] * this.pesos[i];
            somaDosPesos = somaDosPesos + this.pesos[i];
        }
        return somaPonderada / somaDosPesos;
    }

    public boolean aprovado() {
        return this.calculaMedia() >= 7.0;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.calculaMedia() + " " + Arrays.toString(this.notas);
    }
}


