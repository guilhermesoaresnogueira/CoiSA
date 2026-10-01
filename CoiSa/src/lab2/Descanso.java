package lab2;

public class Descanso {

    private int horasDescanso;
    private int numerosSemanas;

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numerosSemanas) {
        this.numerosSemanas = numerosSemanas;
    }

    public String getStatusGeral() {
        if (this.horasDescanso == 0 || this.numerosSemanas == 0) {
            return "Cansado";
        }

        int horasNecessarias = 26 * this.numerosSemanas;

        if (this.horasDescanso >= horasNecessarias) {
            return "Descansado";

        } else {
            return "Cansado";
        }
    }
}





