package br.com.vpelizzarisilva.ebac;

/**
 * @author Vinícius Pelizzari
 */
public class Fibonacci {

    public int getFibElement(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return getFibElement(n-1) + getFibElement(n-2);
    }
}
