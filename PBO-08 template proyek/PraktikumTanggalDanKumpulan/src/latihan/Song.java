package latihan;

import java.time.*;
import java.util.*;


class Song {
    private String title;
    private Duration duration;
    private int playCount;
    private LocalDateTime lastPlayed;

    public Song(String title, Duration duration) {
        this.title = title;
        this.duration = duration;
        this.playCount = 0; // Awalnya lagu belum pernah diputar
        this.lastPlayed = null; // Belum ada waktu pemutaran
    }

    public String getTitle() {
        return title;
    }

    public Duration getDuration() {
        return duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void play() {
        playCount++;
        lastPlayed = LocalDateTime.now(); // Update waktu terakhir diputar
    }

    public LocalDateTime getLastPlayed() {
        return lastPlayed;
    }

    @Override
    public String toString() {
        return title + " (" + formatDuration(duration) + ")";
    }

    private String formatDuration(Duration duration) {
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds() % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
}
