import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número ingresado es " + resultado + ".");
    }
}
