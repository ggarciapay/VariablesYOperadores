package clasificacion1_edad;

import java.util.Scanner;

public class Clasificacion_Edad {
    public static void main(String[] args) {

        Scanner edad = new Scanner(System.in);

        // Solicitar la edad
        System.out.println("Ingrese su edad: ");
        int age = edad.nextInt();

        if (age < 12){
            System.out.println("Eres un niño");
        } else if (age <= 18){
            System.out.println("Eres un adolecente");
        } else if (age < 60){
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres adulto mayor");
        }
    }
}