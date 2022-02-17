package com.dio.ex1;

public class Main {

    public static void main(String[] args) {
        
        // Calculadora
        Calculadora.soma(9, 8);
        Calculadora.subtracao(9, 8);
        Calculadora.multiplicacao(9, 8);
        Calculadora.divisao(9, 8);
        
        // Emprestimo calc
        Emprestimo.calcular(1800, Emprestimo.getDuasParcelas());

        // Mensagem
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);


    }


    
}
