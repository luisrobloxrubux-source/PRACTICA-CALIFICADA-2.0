import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese una edad (0-120): ");
            edad = sc.nextInt();
        } while (edad < 0 || edad > 120);

        System.out.println("Edad válida: " + edad);
    }
}