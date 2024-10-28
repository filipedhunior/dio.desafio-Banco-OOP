public class Conta {

    private String tipoConta ;
    private static final int AGENCIA_PADRAO = 1; // O valor pertence a classe, então sera padrão a todos os objetos e final portanto, não pode ser alterado
    private static int NUMERO_CONTA_SEQUENCIAL = 1; // valor que vai ser incrementado

    private Integer AgenciaConta;
    private Integer NumeroConta;
    private Double saldoConta = 0.0;
    protected Cliente cliente;

    public Conta(String cliente) {
        this.AgenciaConta = AGENCIA_PADRAO;
        this.NumeroConta = NUMERO_CONTA_SEQUENCIAL++;
        this.cliente = new Cliente(cliente);
    }

    public Integer getAgenciaConta() {
        return AgenciaConta;
    }

    public Integer getNumeroConta() {
        return NumeroConta;
    }

    // METODO PARA TRANSFERIR VALOR ENTRE CONTAS
    void transferirValor(Conta contaDestino, Double valorTransferencia){
        this.Sacar(valorTransferencia);
        contaDestino.Depositar(valorTransferencia);
    }

    // Metodo para sacar valor ----------------------------
    void Sacar(Double valorSaque){
        Double saldo = this.saldoConta;
        if (saldo > valorSaque){
            System.out.println("[ERRO] O valor é maior que o saldo disponivel");
            System.out.println("Saldo disponivel " + saldo);
        } else {
            saldo -= valorSaque;
            System.out.println("[ATENÇÂO] Voce tem " + saldo + " de saldo");
        }
    }

    // Metodo para Depositar valor
    void Depositar(Double valorDeposito){
        Double saldo = this.saldoConta;
        saldo += valorDeposito;
        saldoConta = saldo;
        System.out.println("[ATENÇÂO] Voce tem " + saldo + " de saldo");
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return "Conta{"  + "Tipo de Conta: " + tipoConta +
                ", numero=" + NumeroConta +
                ", cliente=" + cliente.nomeCliente +
                ", saldo: " + saldoConta +
                '}';
    }

    void extratoConta(){
    }
}
