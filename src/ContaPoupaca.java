public class ContaPoupaca extends Conta{
    public ContaPoupaca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println(" === Extrato da Conta Poupança === ");
        super.ImprimirDados();
    }
}
