public class AppUm {
    public static void main(String[] args) throws Exception {
        AtendimentoFila atendimentoFila = new AtendimentoFila();

        // Criando 5 clientes e adicionando-os à fila
        for (int i = 1; i <= 5; i++) {
            Cliente cliente = new Cliente(i);
            atendimentoFila.adicionarCliente(cliente);
        }
    }
    }

