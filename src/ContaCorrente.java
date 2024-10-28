public class ContaCorrente extends Conta{
    private String tipoConta = "Poupança";

    public ContaCorrente(String cliente) {
        super(cliente);
    }
    void extratoConta(){
        System.out.println("EXTRATO CONTA CORRENTE");
        System.out.println(super.cliente.nomeCliente);
        System.out.println("AGENCIA: " + super.getAgenciaConta() + " | " + "NUMERO: " + super.getNumeroConta());
        System.out.println(getSaldoConta());
    }
    @Override
    public String toString() {
        return "Conta{" + " Tipo de Conta: " + tipoConta +
                ", numero: " + super.getNumeroConta() +
                ", cliente: " + cliente.nomeCliente +
                ", saldo: " + getSaldoConta() +
                '}';
    }
}
