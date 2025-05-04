import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                System.out.println("Good morning");
                break;
            }
            case 2: {
                System.out.println("Good morning");
                break;
            }
            case 3: {
                System.out.println("Hola");
                break;
            }
            case 4: {
                System.out.println("Namaste");
                break;
            }
            default: {
                System.out.println("Whatever");
                sc.close();
            }
        }

    }
}
