package ru.itmo.basics.lesson3.practice3;

class JavaProgram {
    public static void main(String[] args) {
        Study study1 = new Study();  //создаем объект класса Study
        study1.setCourse("Изучение Java -это просто!");  //устанавливаем значение полю для созданного объекта

        // через объект обратились к методу print, он вернул значение и мы вывели его на экран
        System.out.println(study1.printCourse());
    }

}
