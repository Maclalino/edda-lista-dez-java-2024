import java.util.LinkedList;
import java.util.Queue;

class AtendimentoFila {
    private Queue<Cliente> fila;

    public AtendimentoFila() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
        System.out.println("Cliente " + cliente.getId() + " entrou na fila.");
        atenderCliente();
    }

    private void atenderCliente() {
        if (!fila.isEmpty()) {
            Cliente cliente = fila.poll();
            System.out.println("Cliente " + cliente.getId() + " está sendo atendido.");
            try {
                Thread.sleep(cliente.getTempoAtendimento() * 1000); // Simulando o tempo de atendimento em segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Cliente " + cliente.getId() + " foi atendido em " + cliente.getTempoAtendimento() + " segundos.");
            atenderCliente(); // Chama recursivamente para atender o próximo cliente
        } else {
            System.out.println("Fila vazia. Nenhum cliente para atender.");
        }
    }
}
