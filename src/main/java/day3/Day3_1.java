package day3;

import java.util.Scanner;

public class Day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String city = sc.nextLine();
            if (city.equals("Stop")) {
                break;
            }
            switch (city){
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Лондон":
                case "Ливерпуль":
                case "Манчестер":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");


            }
        }
    }
}
