package day12.day12_4;

import day12.day12_5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;

    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "MusicBand{" + " name = " + name + ", year = " + year + "}";
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2) {
        for (MusicArtist member : mb1.getMembers()) {
            mb2.getMembers().add(member);
        }
        mb1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

}
