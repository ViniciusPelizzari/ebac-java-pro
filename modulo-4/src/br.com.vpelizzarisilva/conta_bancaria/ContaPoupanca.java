package br.com.vpelizzarisilva.conta_bancaria;

/**
 * @author Vinícius Pelizzari
 */
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int saldo) {
        super(saldo);
    }

    public boolean temSaldoParaDebitar(int saldoDebitar) {
        if (saldo >= saldoDebitar) return true;
        return false;
    }
}
