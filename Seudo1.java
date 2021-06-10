import java.util.Scanner;

public class Seudo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int random;
        int contadorpar = 0;
        int contadorimpar = 0;
        System.out.println("Ingrese un numero entero");
        num = scanner.nextInt();
        for (int x = 0; x < num; x++) {
            random = (int) (Math.random() * (100 - 1)) + 1;
            System.out.println("El numero random es " + random);
            if (random % 2 == 0) {
                contadorpar++;
            } else {
                contadorimpar++;
            }
        }
        System.out.println("Hay " + contadorpar + " numeros pares y hay " + contadorimpar + " numeros impares");
    }
}