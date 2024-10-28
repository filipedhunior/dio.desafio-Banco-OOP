public class Cliente {

    private static int NUMERO_CLIETES = 1; // valor que vai ser incrementado

    String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        NUMERO_CLIETES++;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}
