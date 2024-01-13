package ru.itmo.basics.lesson11.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancies("Junior Java Developer");
        site.addVacancies("Intern Java Developer");

        Observer subscriber1 = new Subscriber("Ivanov Ivan");
        Observer subscriber2 = new Subscriber("Petrov Petr");

        site.addObserver(subscriber1);
        site.addObserver(subscriber2);

        site.addVacancies("Trainee Java Developer");
        // как только мы добавили новую вакансию идет уведомление всех подписчиков

        site.removeVacancies("Junior Java Developer");
        //тоже самое с удалением, также идет уведомление подписчиков
    }

}
