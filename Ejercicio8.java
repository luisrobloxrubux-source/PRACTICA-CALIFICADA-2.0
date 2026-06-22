import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int intentos = 0;

        do {
            System.out.print("Ingrese un número mayor que 100: ");
            numero = sc.nextInt();
            intentos++;
        } while (numero <= 100);

        System.out.println("Intentos realizados: " + intentos);
    }
}