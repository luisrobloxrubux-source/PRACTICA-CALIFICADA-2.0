import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;
        char opcion;

        do {
            System.out.print("Ingrese grados Celsius: ");
            celsius = sc.nextDouble();

            fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Fahrenheit: " + fahrenheit);

            System.out.print("¿Desea continuar? (s/n): ");
            opcion = sc.next().charAt(0);

        } while (opcion == 's' || opcion == 'S');

        System.out.println("Programa finalizado.");
    }
}