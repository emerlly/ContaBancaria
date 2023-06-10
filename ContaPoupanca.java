package ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private int saquesRestantes;

    public ContaPoupanca(String numeroConta, double saldo, String titularConta, int saquesRestantes) {
        super(numeroConta, saldo, titularConta);
        this.saquesRestantes = saquesRestantes;
    }

    public int getSaquesRestantes() {
        return saquesRestantes;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (saquesRestantes > 0) {
            setSaldo(getSaldo() - valor);
            saquesRestantes--;
        } else {
            System.out.println("Limite de saques atingido para este mês.");
        }
    }
}
