package ru.itmo.basics.lesson11.strategy;

public class Developer {
    public Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        this.activity.work();
    }
}
