package Day18.Problem1;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Song {
    private String MovieName,SongName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(MovieName, song.MovieName) && Objects.equals(SongName, song.SongName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MovieName, SongName);
    }

    public Song(String movieName, String songName) {
        MovieName = movieName;
        SongName = songName;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public void play(){
        System.out.println(SongName+" of "+MovieName+" is playing...!"
        );
    }
}

class PlayList {
    public List<Song> songs = new ArrayList<>();



    public void addSong(Song song){
        songs.add(song);
        System.out.println("Song added Successfully");
        if(song.equals(songs)){
            System.out.println("song is already have");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int c = 1;
        while (true){
            System.out.println("enter song name " + c);
            String songName = sc.nextLine();
            sc.nextLine();
            System.out.println("ente movie name " + c);

            String movieName = sc.nextLine();

            PlayList pl = new PlayList();

            pl.addSong(new Song(movieName,songName));
            System.out.println("want to add more (y/n)");
            String choise  = sc.next();
            if(choise.equalsIgnoreCase("n")){
                break;
            }
            c++;
        }

    }
}