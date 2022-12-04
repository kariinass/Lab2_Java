import java.util.Scanner;
import java.util.regex.*;

public class lab2_1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату: ");


        String date = in.nextLine();
        Pattern pattern2 = Pattern.compile("[1-9]+/+[0-1]+\\d+/+[1-9]+\\d+\\d+\\d$");
        Matcher matcher2 = pattern2.matcher(date);
        Pattern pattern3 = Pattern.compile("/+1+9+\\d+\\d$");
        Matcher matcher3 = pattern3.matcher(date);
        Pattern pattern4 = Pattern.compile("/+[2-9]+\\d+\\d+\\d$");
        Matcher matcher4 = pattern4.matcher(date);
        Pattern pattern5 = Pattern.compile("[0-9]+/+[0-1]+\\d+/+[1-9]+\\d+\\d+\\d$");
        Matcher matcher5 = pattern5.matcher(date);

        if (date.charAt(2) == '/' & date.charAt(5) == '/') {
            if (date.charAt(0) == '0') {
                if (matcher2.find(1)) {
                    int y = Integer.parseInt(String.valueOf(date.charAt(3)));
                    int z = Integer.parseInt(String.valueOf(date.charAt(4)));
                    if (y == 0 & z >= 1 & z <= 9) {
                        if (matcher3.find()) {
                            System.out.println("Введенное выражение является датой");
                        } else {
                            if (matcher4.find()) {
                                System.out.println("Введенное выражение является датой");
                            } else {
                                System.out.println("Введенное выражение не является датой");
                            }
                        }
                    } else {
                        if (y == 1 & (z == 1 | z == 2 | z == 0)) {
                            if (matcher3.find()) {
                                System.out.println("Введенное выражение является датой");
                            } else {
                                if (matcher4.find()) {
                                    System.out.println("Введенное выражение является датой");
                                } else {
                                    System.out.println("Введенное выражение не является датой");
                                }
                            }
                        } else {
                            System.out.println("Введенное выражение не является датой"); //0./44/....
                        }
                    }
                } else {
                    System.out.println("Введенное выражение не является датой"); //0i/....
                }
            } else {
                if (date.charAt(0) == '1' | date.charAt(0) == '2' | date.charAt(0) == '3') {
                    if (matcher5.find(1)) {
                        int y2 = Integer.parseInt(String.valueOf(date.charAt(3)));
                        int z2 = Integer.parseInt(String.valueOf(date.charAt(4)));
                        if (y2 == 0 & z2 >= 1 & z2 <= 9) {
                            if (matcher3.find()) {
                                System.out.println("Введенное выражение является датой");
                            } else {
                                if (matcher4.find()) {
                                    System.out.println("Введенное выражение является датой");
                                } else {
                                    System.out.println("Введенное выражение не является датой");
                                }
                            }
                        } else {
                            if (y2 == 1 & (z2 == 1 | z2 == 2 | z2 == 0)) {
                                if (matcher3.find()) {
                                    System.out.println("Введенное выражение является датой");
                                } else {
                                    if (matcher4.find()) {
                                        System.out.println("Введенное выражение является датой");
                                    } else {
                                        System.out.println("Введенное выражение не является датой");
                                    }
                                }
                            } else {
                                System.out.println("Введенное выражение не является датой");
                            }
                        }
                    } else {
                        System.out.println("Введенное выражение не является датой");
                    }
                } else {
                    System.out.println("Введенное выражение не является датой");
                }
            }
        } else {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
    }
}
