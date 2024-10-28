public class ContaPoupança extends Conta{
    private String tipoConta = "Corrente";

    public ContaPoupança(String cliente) {
        super(cliente);
    }
    void extratoConta(){
        System.out.println("EXTRATO CONTA POUPANÇA");
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
