package tcepam.week4.tsk3;

import java.io.*;

public class ReadUtf8WriteUtf16 {

    public static void main(String[] args) {

        String inFile = "in-utf8.txt";
        String outFile = "out-utf16.txt";

        File fileIn = new File(inFile);
        File fileOut = new File(outFile);

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileIn), "UTF8"));
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOut), "UTF16"));

            String str;

            while ((str = bufferedReader.readLine()) != null) {
                out.append(str).append("\r\n");
                out.flush();
            }

            bufferedReader.close();
            out.close();

        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
