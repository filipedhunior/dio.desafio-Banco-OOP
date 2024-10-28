public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("Felipe");
        System.out.println(contaCorrente.toString());

        Conta contaPoupança = new Conta("Filipe");
        System.out.println(contaPoupança.toString());

        contaCorrente.Depositar(1320.0);
        System.out.println(contaCorrente.toString());

        contaCorrente.transferirValor(contaPoupança, 1000.0);
        System.out.println(contaCorrente.toString());


//        contaCorrente.extratoConta();
    }
}