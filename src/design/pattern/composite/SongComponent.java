package design.pattern.composite;

/**
 * Created by seal on 11/6/2016.
 */
public abstract class SongComponent {

    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int index) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }


}
