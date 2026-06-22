import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        int contador = 0;
        char continuar;

        do {
            System.out.print("Ingrese una nota: ");
            nota = sc.nextDouble();

            suma += nota;
            contador++;

            System.out.print("¿Desea continuar? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Promedio: " + (suma / contador));
    }
}