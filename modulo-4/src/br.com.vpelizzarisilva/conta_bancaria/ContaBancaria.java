package br.com.vpelizzarisilva.conta_bancaria;

/**
 * @author Vinícius Pelizzari
 */
public abstract class ContaBancaria {

    protected  int saldo;

    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

//    cria um método que as subclasses devem implementar
    public abstract boolean temSaldoParaDebitar(int saldoDebitar);
}
