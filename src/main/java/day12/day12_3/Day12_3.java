/*package day12.day12_3;

import day12.day12_4.MusicBand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day12_3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Paradis", 2011);
        MusicBand band2 = new MusicBand("Gorillaz", 1998);
        MusicBand band3 = new MusicBand("Metronomy", 1999);
        MusicBand band4 = new MusicBand("Monophonics", 2007);
        MusicBand band5 = new MusicBand("The Neighbourhood", 2011);
        MusicBand band6 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band7 = new MusicBand("Tame Impala", 2007);
        MusicBand band8 = new MusicBand("Empire of The Sun", 2007);
        MusicBand band9 = new MusicBand("Crystal Castles", 2003);
        MusicBand band10 = new MusicBand("Leisure", 2015);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> musicBands2000 = new ArrayList<>();

        for (MusicBand musicBand : musicBands) {
            if (musicBand.getYear() > 2000) {
                musicBands2000.add(musicBand);
            }
        }
        System.out.println(musicBands2000);

    }
}*/
