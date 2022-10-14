/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluacionNro2;

import java.math.BigInteger;

/**
 *
 * @author Usuario
 */
public class metodosCalculadoresII {

    public static boolean esPrimo(int n) {
        boolean primo = true;
        int i = 2;
        if (n > 2) {
            primo = esPrimoAux(n, i, primo);
        } else {
            primo = false;
        }
        return primo;
    }

    private static boolean esPrimoAux(int n, int i, boolean primo) {

        if (i != n || primo == false) {

            if ((n % i) == 0) {
                primo = false;
            } else {
                primo = esPrimoAux(n, i + 1, primo);
            }
        }

        return primo;
    }

    //MOSTRAR SECUENCIA FIBONACCI HASTA UN VALOR 
    public static String fibonacciHasta(int n) {
        return fibonacciHastaAux1(n, 0);
    }

    private static String fibonacciHastaAux1(int n, int i) {
        String result = "";
        if (n >= fibonacciHastaAux2(i)) {
            result += fibonacciHastaAux2(i) + " ";
            result += fibonacciHastaAux1(n, i + 1);
        }
        return result;
    }

    private static int fibonacciHastaAux2(int i) {
        int x;
        if (i == 0) {
            x = 0;
        } else {
            if (i == 1) {
                x = 1;
            } else {
                x = fibonacciHastaAux2(i - 2) + fibonacciHastaAux2(i - 1);
            }
        }
        return x;
    }

    //SUMA DE DIGITOS DE UN NUMERO N
    public static int sumaDeDigitos(int n) {
        int result = sumaDeDigitosAux(n);
        return result;
    }

    private static int sumaDeDigitosAux(int n) {
        int result = 0;
        if (n < 9) {
            result = n;
        } else {
            result += n % 10;
            result += sumaDeDigitosAux(n / 10);
        }
        return result;
    }

    //FACTORIAL DE UN NUMERO N
    public static BigInteger factorial(int n) {
        return factorialAux(n);
    }

    private static BigInteger factorialAux(int n) {
        BigInteger result;

        if (n != 0) {
            
            if (n == 1) {
                result = new BigInteger(n + "");
            } else {
                result = (factorialAux(n - 1).multiply(new BigInteger(n + "")));
            }
        }else{
            result = new BigInteger("0");
        }
        return result;
    }

    //CIFRAS DE UN NUMERO N
    public static int numeroCifras(BigInteger n) {
        return numeroCifrasAux(n);
    }

    private static int numeroCifrasAux(BigInteger n) {
        int result;
        if (n.divide(new BigInteger("10")).equals(new BigInteger("0"))) {
            result = 1;
        } else {
            result = 1 + numeroCifrasAux(n.divide(new BigInteger("10")));
        }
        return result;
    }
}
