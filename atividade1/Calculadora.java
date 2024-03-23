package atividade1;

public class Calculadora {
    double numA;
    double numB;

    double somar() {
        return numA + numB;
    }

    double subtrair() {
        return numA - numB;
    }

    double multiplicar() {
        return numA * numB;
    }

    double dividir() {
        if (numB != 0) {
            return numA / numB;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; 
        }
    }

    boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            System.out.println("Digite um número maior que 1");
            return false; 
        }
    
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Não é primo");
                return false; 
            }
        }
    
        System.out.println("É primo");
        return true; 
    }
    
}
