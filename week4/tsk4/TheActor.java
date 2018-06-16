package tcepam.week4.tsk4;

import java.io.Serializable;

public class TheActor implements Serializable {

    private String name;

    public TheActor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TheActor{" +
                "name='" + name + '\'' +
                '}';
    }
}
