import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
//
//        boolean salir = false;
//        while (!salir) {
//            try {
                System.out.println("Escribe una palabra");
        String palabra = sn.nextLine();
//
//                System.out.println("La palabra es: " + paraula);
//
                System.out.println("Elige una letra");
                String letra = sn.nextLine();
//
//                salir = true;
//
//                System.out.println("Se repite " + paraula.indexOf(letra)+ " veces");
//
//            } catch (InputMismatchException e) {
//                System.out.println("Error, hasta introducido un valor incorrecto");
//            }
//        }
//        fin del while


        int veces = contarLetras(palabra, letra.charAt(0));
        System.out.println("La letra se repite: " + veces + " veces");

    }

    static int contarLetras(String palabra, char letra) {
        int cont = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) { //posición charAT(i) = 0
                cont++;
            }
        }
        return cont;
    }
}