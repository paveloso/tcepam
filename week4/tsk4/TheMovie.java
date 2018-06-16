package tcepam.week4.tsk4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TheMovie implements Serializable {

    private String title;

    private List<TheActor> actors = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TheActor> getActors() {
        return actors;
    }

    public void setActors(List<TheActor> actors) {
        this.actors = actors;
    }

    public TheMovie(String title) {
        this.title = title;
    }

    public void addActor(TheActor theActor) {
        actors.add(theActor);
    }

    public void getActorsList() {
        for (TheActor theActor : actors) {
            System.out.println(theActor);
        }
    }

    @Override
    public String toString() {
        return title;
    }
}
