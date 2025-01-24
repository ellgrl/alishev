package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");
        List<String> people = new ArrayList<String>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;

    }
}
