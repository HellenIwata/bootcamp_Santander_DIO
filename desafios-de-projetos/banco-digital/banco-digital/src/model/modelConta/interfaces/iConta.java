package model.modelConta.interfaces;

import model.modelConta.Conta;

public interface iConta {
      //Metodos
    void sacarValor(double valor);
    void depositarValor(double valor);
    void transferirValor(double valor, Conta contaDestino);
    void consultarSaldo();
}
