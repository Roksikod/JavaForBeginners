package ru.itmo.basics.lesson11.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

//        developer.setActivity(new Training());
//        developer.executeActivity();
//
//        developer.setActivity(new Coding());
//        developer.executeActivity();
//
//        developer.setActivity(new Reading());
//        developer.executeActivity();
//
//        developer.setActivity(new Sleeping());
//        developer.executeActivity();

        runActivity(developer, new Coding());
    }

    public static void runActivity(Developer developer, Activity activity) {
        developer.setActivity(activity);
        developer.executeActivity();
    }
}
