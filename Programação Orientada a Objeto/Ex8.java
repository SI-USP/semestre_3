import java.util.*;

public class Ex8 {
    public static void metodo() {
        try {
            int a, b, c;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite dois números: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a - b < 0)
                return;
            c = a / (a - b);
            System.out.println("Resultado = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero!");
        } finally {
            System.out.println("Finally.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Ex8: inicio.");
        metodo();
        System.out.println("Ex8: fim.\n");
    }
}
