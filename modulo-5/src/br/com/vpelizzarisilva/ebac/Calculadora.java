package br.com.vpelizzarisilva.ebac;

/**
 * Classe usada para calcular operações entre 2 números inteiros.
 *
 * adicionar -> adiciona 2 elementos
 * subtrair -> subtrai 2 elementos
 * multiplicar -> multiplica 2 elementos
 * dividir -> divide 2 elementos ignorando o resto e se o denominador for 0 joga um erro aritimético.
 *
 * @author Vinícius Pelizzari
 */

public class Calculadora {

    public int adicionar(int a, int b){
        return a+b;
    }

    public int subtrair(int a, int b){
        return a-b;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }

    public int dividir (int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0){
            throw new ArithmeticException("Erro dividir por 0");
        }
        return numerador/denominador;

    }
}
