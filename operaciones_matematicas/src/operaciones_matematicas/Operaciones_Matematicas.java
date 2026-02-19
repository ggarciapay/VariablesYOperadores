package operaciones_matematicas;

import java.util.Scanner;

public class Operaciones_Matematicas {
    public static void main(String[] args) {
        Scanner ingresoDeNumeros = new Scanner(System.in);

        // Operaciones Matematicas Con Tipo De Dato Int
        System.out.println("****Operaiones Matematicas Con Int****");

        // Operaciones Matematicas Con Tipo De Dato Double
        System.out.println("Ingrese primer número: ");
        int num1 = ingresoDeNumeros.nextInt();

        System.out.println("Ingrese segundo número: ");
        int num2 = ingresoDeNumeros.nextInt();

        // Impresión de datos
        System.out.println("\nLos resultados de las operaciones son: ");
        System.out.println("Suma: " + (num1 + num2) + "\nResta: " + (num1 - num2) + "\nMultiplicación: " + (num1 * num2) +
                "\nDivisión: " + (num1 / num2));

        // Operaciones con tipo de dato double
        System.out.println("\n****Operaciones Matematicas Con Double****\n");

        // Lectura de datos ingresados por teclado tipo double
        System.out.println("Ingrese primer número decimal: ");
        double double1 = ingresoDeNumeros.nextDouble();

        System.out.println("Ingrese segundo número decimal: ");
        double double2 = ingresoDeNumeros.nextDouble();

        // Impresión de datos
        System.out.println("\nLos resultados de las operaciones son: ");
        System.out.println("Suma: " + (double1 + double2) + "\nResta: " + (double1 - double2) + "\nMultiplicación: " + (double1 * double2) +
                "\nDivisión: " + (double1 / double2));

       // Operaciones con tipo de dato float
        System.out.println("\n****Operaciones Matematicas Con Float****\n");

        // Lectura de datos ingresados por teclado tipo Float
        System.out.println("Ingrese primer número decimal: ");
        float float1 = ingresoDeNumeros.nextFloat();

        System.out.println("Ingrese segundo número decimal:");
        float float2 = ingresoDeNumeros.nextFloat();

        // Impresión de datos
        System.out.println("\nLos resultados de las operaciones son: ");
        System.out.println("Suma: " + (float1 + float2) + "\nResta: " + (float1 - float2) + "\nMultiplicación: " + (float1 * float2) +
                "\nDivisión: " + (float1 / float2));

        // Operaciones con tipo de short
        System.out.println("\n****Operaciones Matematicas Con Short****\n");

        // Lectura de datos ingresados por teclado tipo short
        System.out.println("Ingrese primer número: ");
        short short1 = ingresoDeNumeros.nextShort();

        System.out.println("Ingrese segundo número: ");
        short short2 = ingresoDeNumeros.nextShort();

        // Impresión de datos
        System.out.println("\nLos resultados de las operaciones son: ");
        System.out.println("Suma: " + (short1 + short2) + "\nResta: " + (short1 - short2) + "\nMultiplicación: " + (short1 * short2) +
                "\nDivisión: " + (short1 / short2));

        // Operaciones con tipo de dato byte
        System.out.println("\n****Operaciones Matematicas Con Byte****\n");

        // Lectura de datos ingresados por teclado tipo byte
        System.out.println("Ingrese primer número no mayor a 127: ");
        byte byte1 = ingresoDeNumeros.nextByte();

        System.out.println("Ingrese segundo número no mayor a 127: ");
        byte byte2 = ingresoDeNumeros.nextByte();

        // Impresión de datos
        System.out.println("\nLos resultados de las operaciones son: ");
        System.out.println("Suma: " + (byte1 + byte2) + "\nResta: " + (byte1 - byte2) + "\nMultiplicación: " + (byte1 * byte2) +
                "\nDivisión: " + (byte1 / byte2));
        ingresoDeNumeros.close();
    }
}