package ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String numeroConta, double saldo, String titularConta, double limite) {
        super(numeroConta, saldo, titularConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

 

	@Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
