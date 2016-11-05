package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seal on 11/6/2016.
 */
public class SongGroup extends SongComponent {

    List<SongComponent> songComponents = new ArrayList<>();

    private String groupName;
    private String groupDiscription;

    public SongGroup(String groupName, String groupDiscription) {
        this.groupName = groupName;
        this.groupDiscription = groupDiscription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getComponent(int index) {
        return songComponents.get(index);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(groupName);
        System.out.println(groupDiscription);

        songComponents.stream()
                .forEach(System.out::println);
    }
}
