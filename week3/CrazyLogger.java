package tcepam.week3.tsk1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private final static int ARRAY_SIZE_BY_DEFAULT = 10;

    //all data will be stored in an array
    private String[] log = new String[ARRAY_SIZE_BY_DEFAULT];

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : hh-mm");

    //create add() method to add message in a format: date + message
    public void addRecordToLog(String s) {
        StringBuilder sb = new StringBuilder();
        Date date = new Date();
        String dateS = dateFormat.format(date);
        sb.append(dateS);
        sb.append(" ").append(s);
        String finalString = sb.toString();

        int index = 0;

        if (log[0] == null) {
            log[0] = finalString;
        } else {
            for (int i = 0; i < log.length; i++) {
                if (log[i] == null) {
                    index = i;
                    break;
                }
            }
            if (index == 0) {
                //fix FULL array
                String[] tempLog = new String[((log.length / 2) + 1) + log.length];
                for (int i = 0; i < log.length; i++) {
                    tempLog[i] = log[i];
                }
                log = new String[tempLog.length];
                log = tempLog.clone();
            } else {
                log[index] = finalString;
            }
        }
    }

    public void printLog() {
        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println(log[i]);
            }
        }
    }

    //create search() method to search through
    public void searchMessage(String s) {
        boolean isMatch = false;
        for (int i = 0; i < log.length; i++) {
            String tempS = log[i];
            if (tempS.contains(s)) {
                System.out.println(log[i]);
                isMatch = true;
            }
        }
        if (!isMatch) {
            System.out.println("Can't find!");
        }
    }
}
