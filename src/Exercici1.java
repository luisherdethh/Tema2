import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("Escribe una palabra");
                String paraula = sn.nextLine();

                System.out.println("La palabra es: " + paraula);

                System.out.println("Elige una letra");
                String letra = sn.nextLine();

                System.out.println("La letra es: " + letra);

                salir = true;
                int repite = 0;
                repite = contar(paraula, letra);
            } catch (InputMismatchException e) {
                System.out.println("Error, hasta introducido un valor incorrecto");
            }
        }
//        fin del while

    public static int contar(String paraula, caracter) {

    }
}
}

//https://developer.mozilla.org/es/docs/Web/JavaScript/Referencia/Objetos_globales/String/indexOf
