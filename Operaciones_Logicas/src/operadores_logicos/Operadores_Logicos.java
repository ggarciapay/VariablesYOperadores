package operadores_logicos;

import java.util.Scanner; // importa la clase

public class Operadores_Logicos {
    public static void main(String[] args) {

        // Recibe datos ingresados por teclado
        Scanner ingreso_valores = new Scanner(System.in);

        System.out.println("Ingrese un valor numérico: ");
        int num1 = ingreso_valores.nextInt();

        System.out.println("Ingrese segundo valor numérico: ");
        int num2 = ingreso_valores.nextInt();

        // Comparaciones
        System.out.println("***Comparaciones***\n");
        System.out.println("El primer número es mayor " + (num1 > num2));
        System.out.println("El segundo número es mayor " + (num2 > num1));
        System.out.println("Los números son iguales " + (num1 == num2));

        // Operador logico AND &&
        System.out.println("\n***Operadores Logicos***\n");
        System.out.println("Los dos números son mayores que 0 " + (num1 > 0 && num2 > 0));
        System.out.println("Uno de los dos números es menor 0 " + (num1 > 0 || num2 > 0));

        ingreso_valores.close();
    }
}