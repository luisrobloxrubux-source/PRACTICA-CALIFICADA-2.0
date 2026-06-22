import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random() * 10) + 1;
        int numero;

        do {
            System.out.print("Adivina el número (1-10): ");
            numero = sc.nextInt();

            if (numero != secreto) {
                System.out.println("Incorrecto.");
            }

        } while (numero != secreto);

        System.out.println("¡Correcto!");
    }
}