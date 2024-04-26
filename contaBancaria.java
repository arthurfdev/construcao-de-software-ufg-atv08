class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar o saque.");
    }
}

class ContaBancaria {
    private Double saldo;

    public ContaBancaria(Double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.sacar(500.0);
            System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
            
            conta.sacar(700.0); // Isso deve lançar a exceção SaldoInsuficienteException
            System.out.println("Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao fazer saque: " + e.getMessage());
        }
    }
}
