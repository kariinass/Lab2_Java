import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пароль: ");

        String password = in.nextLine();
        Pattern pattern1 = Pattern.compile("\\d{1,}");
        Matcher matcher1 = pattern1.matcher(password);
        Pattern pattern2 = Pattern.compile("[a-z]{1,}");
        Matcher matcher2 = pattern2.matcher(password);
        Pattern pattern3 = Pattern.compile("[A-Z]{1,}");
        Matcher matcher3 = pattern3.matcher(password);
        Pattern pattern4 = Pattern.compile("\\W{0}");
        Matcher matcher4 = pattern4.matcher(password);

        if (password.length() >= 8) {
            if (matcher1.find()) {
                if (matcher2.find()) {
                    if (matcher3.find()) {
                        if (matcher4.find()) {
                            System.out.println("Пароль надежен");
                        } else {
                            System.out.println("Пароль ненадежен. Повторите ввод");
                        }
                    } else {
                        System.out.println("Пароль ненадежен. Повторите ввод");
                    }
                } else {
                    System.out.println("Пароль ненадежен. Повторите ввод");
                }
            } else {
                System.out.println("Пароль ненадежен. Повторите ввод");
            }
        } else {
            System.out.println("Пароль ненадежен. Повторите ввод");
        }
    }
}
