package tcepam.week4.tsk2;

import java.io.*;

public class CharacterStreamPractice {

    public static void main(String[] args) throws IOException {

        String inFile = "in.txt";
        String outFile = "out.txt";

        String worToCompareTo = "word";
        int repTimes = 0;

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        String[] arr = new String[0];

        try {
            fileReader = new FileReader(inFile);
            fileWriter = new FileWriter(outFile);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();


            while (line != null) {
                String[] arrOfStrings = line.split("[.,\\s+]");

                line = bufferedReader.readLine();

                arr = arrOfStrings.clone();
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(worToCompareTo)) {
                    fileWriter.write(worToCompareTo);
                    repTimes++;
                }
            }

            fileWriter.write("\n : " + repTimes);
        } finally {
            fileReader.close();
            fileWriter.close();
        }
    }
}
