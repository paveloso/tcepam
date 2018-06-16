package tcepam.week4.tsk4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TheApp {

    public static void main(String[] args) throws IOException {

        TheMovie movie1 = new TheMovie("Fast and Furious");
        TheActor actor1 = new TheActor("Vin Diesel");
        TheActor actor2 = new TheActor("Jordana Brewster");

        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.getActorsList();
        System.out.println("");

        TheMovie movie2 = new TheMovie("Friends with benefits");
        TheActor actor3 = new TheActor("Justin Timberlake");
        TheActor actor4 = new TheActor("Mila Kunis");

        movie2.addActor(actor3);
        movie2.addActor(actor4);
        movie2.getActorsList();
        System.out.println("");

        List<TheMovie> movieCollection = new ArrayList<>();
        movieCollection.add(movie1);
        movieCollection.add(movie2);
        for (TheMovie theMovie : movieCollection)
            System.out.println(theMovie);


        FileOutputStream fos = new FileOutputStream("ser-file.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(movie2);
        oos.flush();
        oos.close();
    }
}
