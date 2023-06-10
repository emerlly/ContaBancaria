package ContaBancaria;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titularConta;

    public ContaBancaria(String numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public abstract void depositar(double valor);
    public abstract void sacar(double valor);
}
