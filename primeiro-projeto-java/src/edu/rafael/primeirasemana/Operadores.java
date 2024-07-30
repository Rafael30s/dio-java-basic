package edu.rafael.primeirasemana;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; // 31
        concatenacao = 1 + "1" + 1 + 1; // 1111
        concatenacao = 1 + "1" + 1 + "1"; // 1111
        concatenacao = "1" + 1 + 1 + 1; // 1111
        concatenacao = "1" + (1 + 1 + 1); // 13

        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); // true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true

        // equals na parada
        System.out.println(nome1.equals(nome2)); // ??
        System.out.println(nome2.equals(nome3)); // ??
        System.out.println(nome3.equals(nome4)); // ??
    }

}
