import java.util.Scanner;

public class dz2variant {
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
        System.out.println("Человек по имени " + name + "живет в городе " + city + ".");
        System.out.println("Этому человеку " + age + " лет и он любит заниматься " + hobby);


    }
}
