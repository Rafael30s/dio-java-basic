package edu.rafael.primeirasemana;

public class TiposVariaveis {

    public static void main(String[] args) {

        // Tipos primitivos

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L; // necessario finalizar com L
        float pi = 3.14F; // float sempre precisa terminar com F, pois senão será confundido ccom double
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Constantes
        // para definir constantes, é necessario colocar final no inicio
        // Por convenção, Constantes são sempre escritas em CAIXA ALTA.
        final double VALOR_DE_PI = 3.14;

    }
}
