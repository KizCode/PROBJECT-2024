package latihan;

import java.time.*;
import java.time.temporal.*;
import java.util.*;


class Album {
    private String title;
    private String artist;
    private int year;
    private List<Song> songs;

    public Album(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Duration getTotalDuration() {
        return songs.stream()
                .map(Song::getDuration)
                .reduce(Duration.ZERO, Duration::plus);
    }

    public Song getMostPlayedSong() {
        return songs.stream()
                .max(Comparator.comparingInt(Song::getPlayCount))
                .orElse(null);
    }

    public void displaySongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public List<Song> getSongs() {
        return songs;
    }
}

