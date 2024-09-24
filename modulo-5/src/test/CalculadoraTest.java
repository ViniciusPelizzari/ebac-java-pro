package test;

import br.com.vpelizzarisilva.ebac.Calculadora;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vinícius Pelizzari
 */

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void somaTest(){
       int result = calc.adicionar(1,2);
        Assert.assertEquals(result, 1+2);
    }

    @Test
    public void subtrairTest(){
        int result = calc.subtrair(2,1);
        Assert.assertEquals(result, 2-1);
    }

    @Test
    public void multiplicarTest(){
        int result = calc.multiplicar(2,2);
        Assert.assertEquals(result, 2*2);
    }

    @Test
    public void dividirTest_happyPath(){
        int result = calc.dividir(4,2);
        Assert.assertEquals(result, 4/2);
    }

    @Test(expected = ArithmeticException.class)
    public void dividirTest_divideByZero() throws ArithmeticException {
        int result = calc.dividir(4,0);

    }
}
