package variables;

import java.util.Scanner; //importa la clase

public class Variables {
    public static void main(String[] args) {

        // Recibe los valores ingresados por el usuario
        Scanner myScanner = new Scanner(System.in);

        // Numeros Enteros
        System.out.println("Ingrese un número entero: ");
        int numeroEntero = myScanner.nextInt();

        // Numeros decimales grandes
        System.out.println("Ingrese un número decimal: ");
        double numeroDecimal = myScanner.nextDouble();

        // Cadenas de texto
        System.out.println("Escriba su palabra favorita: ");
        String cadenaDeTexto = myScanner.next();

        // Valores true o false
        System.out.println("Escriba la palabra 'true' o 'false' para continuar ");
        boolean verdadero_falso = myScanner.nextBoolean();

        // Impresión de los datos ingresados
        System.out.println("\nLos datos ingresados son:");
        System.out.println(numeroEntero + "\n" + numeroDecimal + "\n" + cadenaDeTexto + "\n" + verdadero_falso);
        myScanner.close(); // Cierra el Scanner

    }
}