package ru.ithub.first;

public class Main {
    public static void main(String[] args) {

//        LogHistory.getLogHistory().addLogData(false);
//        LogHistory.getLogHistory().getLog();
        Thread showInf = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                System.out.println(LogHistory.getLogHistory().getLog());
            }
        });

        Thread editInf = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                if (LogHistory.getLogHistory().getLog() == false) {
                    LogHistory.getLogHistory().addLogData(true);
                } else if (LogHistory.getLogHistory().getLog() == true) {
                    LogHistory.getLogHistory().addLogData(false);
                }
            }
        });

        editInf.start();
        showInf.start();


    }
}