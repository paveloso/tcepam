package tcepam.week4.tsk4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("ser-file.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TheMovie theMovie = (TheMovie) ois.readObject();
        System.out.println(theMovie);
        theMovie.getActorsList();
    }
}
