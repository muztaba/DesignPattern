package design.pattern.composite;

/**
 * Created by seal on 11/6/2016.
 */
public class Song extends SongComponent {

    private String songName;
    private String bandName;
    private int releaseYear;


    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getSongName() {
        return super.getSongName();
    }

    @Override
    public String getBandName() {
        return super.getBandName();
    }

    @Override
    public int getReleaseYear() {
        return super.getReleaseYear();
    }
}
