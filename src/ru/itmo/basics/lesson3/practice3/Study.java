package ru.itmo.basics.lesson3.practice3;

public class Study {
    private String course;

    //конструктор принимает один параметр и устанавливает его в поле course
    public void setCourse(String course) {
        this.course = course;
    }

    //метод возвращает значение поля
    public String printCourse() {
        return this.course;
    }
}

