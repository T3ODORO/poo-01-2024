package atividade1;

public class Main {
    
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        

        calc.numA = 2.0;
        calc.numB = 3;

        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());


        System.out.println("Verificação de primos:");
        System.out.println("É primo? " + calc.verificarNumeroPrimo(0));
    }


}
