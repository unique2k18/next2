import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш город: ");
        String city = scanner.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите ваше хобби: ");
        String hobby = scanner.nextLine();
        System.out.println("Имя: " + name);
        System.out.println("Город: " +city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

    }
}
