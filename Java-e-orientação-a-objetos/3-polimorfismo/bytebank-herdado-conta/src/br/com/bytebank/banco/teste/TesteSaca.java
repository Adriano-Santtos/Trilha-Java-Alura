package br.com.bytebank.banco.teste;


import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(190.0);

        conta.saca(190.0);

        System.out.println(conta.getSaldo());
    }
}
