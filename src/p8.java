import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];

        System.out.println("Wybierz imie:");
        person[0] = scanner.next();

        System.out.println("Wybierz Rasa:");
        person[1] = scanner.next();

        System.out.println("Wybierz Płeć:");
        person[2] = scanner.next();

        System.out.println("Wybierz Broń:");
        person[3] = scanner.next();

        System.out.println("Twoja postać to:");
        for (int i=0;i<4;i++)

        { System.out.println(person[i]);}
    }
}