package day12.day12_5;

import day12.day12_4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Day12_5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("John",27));
        members1.add(new MusicArtist("Jane",31));
        members1.add(new MusicArtist("Bob",29));
        members1.add(new MusicArtist("Lilian",19));
        members1.add(new MusicArtist("Mary",22));
        members1.add(new MusicArtist("Robby",30));

        MusicBand band1 = new MusicBand("Monophonics", 2007, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Marry",24));
        members2.add(new MusicArtist("Kate",26));
        members2.add(new MusicArtist("John",22));
        members2.add(new MusicArtist("Bob",29));
        members2.add(new MusicArtist("Lucy",21));

        MusicBand band2 = new MusicBand("DROPS", 2016, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }

}
