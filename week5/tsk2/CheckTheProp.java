package tcepam.week5.tsk2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class CheckTheProp {

    public void readTheProp() {

        System.out.println("Name of properties file you want to read?");
        Scanner scanner1 = new Scanner(System.in);
        String fileName = scanner1.nextLine();

        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            final String fullFileName = "src/main/resources/" + fileName + ".properties";
            inputStream = new FileInputStream(fullFileName);
            properties.load(inputStream);

            System.out.println("Name of KEY which VALUE you want to get?");
            Scanner scanner2 = new Scanner(System.in);
            String keyName = scanner2.nextLine();

            try {
                String key = properties.getProperty(keyName);
                if (key == null) {
                    throw new NoSuchFieldException();
                } else {
                    System.out.println("The VALUE for " + keyName + " is: " + key);
                }
            } catch (NoSuchFieldException e) {
                System.out.println(keyName + " not found");
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    
