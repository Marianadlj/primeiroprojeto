public class Main {
    public static void main (String[] args){

        Cliente mariana = new Cliente();
        mariana.setNome("Mariana");


        Conta cc = new ContaCorrente(mariana);
        Conta poupaca = new ContaPoupaca(mariana);

        cc.ImprimirDados();
        poupaca.ImprimirDados();
    }
}
