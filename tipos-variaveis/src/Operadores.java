public class Operadores {
    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;

        a = 6;
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "falso";

        // // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";
        System.out.println(resultado);

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // String resultado = (a == b) ? "verdadeiro" : "false";

        // System.out.println(valor);

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");
    }
}
