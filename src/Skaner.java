import java.util.Scanner;
/*Klasa Scanner to domyślna klasa dostarczona przez jave,
sout do generowania wiadomości, scanner.nextLine do wprowadzenia wartości
 */
public class Skaner {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swoje imię");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);

    }
}
