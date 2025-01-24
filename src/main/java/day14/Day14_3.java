package day14;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }
    public static List<Person> parseFileToObjList() {
        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                Person thisPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(thisPerson);
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

