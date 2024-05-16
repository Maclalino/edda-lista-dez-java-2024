import java.util.Random;

class Cliente {
    private int id;
    private int tempoAtendimento;

    public Cliente(int id) {
        this.id = id;
        this.tempoAtendimento = new Random().nextInt(10) + 1; // Tempo de atendimento aleatório entre 1 e 10
    }

    public int getId() {
        return id;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }
}
