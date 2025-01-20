package day7;

import java.util.Scanner;

public class Day7_1 {
    public static void main(String[] args) {
        Airplane airplaneA = new Airplane("boeing", 2020, 18, 4000);
        Airplane airplaneB = new Airplane("boeing", 2018, 21, 5000);

        Airplane.compareAirplanes(airplaneA, airplaneB);

    }
}
