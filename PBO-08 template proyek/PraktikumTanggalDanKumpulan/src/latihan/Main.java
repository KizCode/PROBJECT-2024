package latihan;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Album coolUncle = new Album("Cool Uncle", "Bobby Caldwell", 2015);
        
       
        coolUncle.addSong(new Song("Intro", Duration.ofSeconds(13)));
        coolUncle.addSong(new Song("Game Over", Duration.ofMinutes(4).plusSeconds(44)));
        coolUncle.addSong(new Song("Breaking Up", Duration.ofMinutes(4).plusSeconds(25)));
        coolUncle.addSong(new Song("Never Knew Love Before", Duration.ofMinutes(5).plusSeconds(49)));
        coolUncle.addSong(new Song("Mercy", Duration.ofMinutes(3).plusSeconds(30)));
        coolUncle.addSong(new Song("Destiny", Duration.ofMinutes(4).plusSeconds(5)));
        coolUncle.addSong(new Song("Embrace The Night", Duration.ofMinutes(4).plusSeconds(20)));
        coolUncle.addSong(new Song("My Beloved", Duration.ofMinutes(3).plusSeconds(47)));
        coolUncle.addSong(new Song("Break Away", Duration.ofMinutes(3).plusSeconds(43)));

   
        coolUncle.getSongs().get(3).play(); 
        coolUncle.getSongs().get(3).play(); 
        coolUncle.getSongs().get(1).play(); 
        coolUncle.getSongs().get(4).play(); 
        coolUncle.getSongs().get(4).play(); 


        System.out.println("Album " + coolUncle.getTitle() + " (" + coolUncle.getYear() + ") oleh " + coolUncle.getArtist());
        coolUncle.displaySongs();

      
        Duration totalDuration = coolUncle.getTotalDuration();
        System.out.println("Durasi: " + totalDuration.toMinutes() + " menit");

      
        Song mostPlayedSong = coolUncle.getMostPlayedSong();
        if (mostPlayedSong != null) {
            System.out.println("Lagu favorit: " + mostPlayedSong.getTitle());
        }

 
        LocalDateTime lastPlayedTime = LocalDateTime.now().minusDays(41); 
        long daysAgo = ChronoUnit.DAYS.between(lastPlayedTime, LocalDateTime.now());
        System.out.println("Terakhir dimainkan: " + daysAgo + " hari yang lalu");
    }
}