import java.util.Scanner;

public class dz2variant2 {
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
        System.out.println(name + "- имя");
        System.out.println(city + "- город");
        System.out.println(age + "- возраст");
        System.out.println(hobby + "- хобби");
    }
}
