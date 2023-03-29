package ru.ithub.first;

public class LogHistory {
    private static LogHistory logHistory;
    private static boolean premium = true;

    public static synchronized LogHistory getLogHistory (){
        if(logHistory == null){
            logHistory = new LogHistory();
        }
        return logHistory;
    }

    private LogHistory(){

    }

    public void addLogData(boolean state){
        premium = state;
    }

    public boolean getLog(){
        return premium;
    }

}
