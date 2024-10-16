package com.teachmeskills.lesson_6.task_1;
    /**
     * Создать класс для описания студента нашей группы.
     * Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
     * Создать объекты этого класса для каждого из студента нашей группы.
     * Поместить все эти объекты в массив.
     * Пройти по массиву циклом for и вывести информацию на консоль.
     */
public class Main {

    public static void main(String[] args) {

        Student[] groupStudents = {
                new Student("Dima", "Kudriavcev", 123456, "C32-onl", 31),
                new Student("Kate", "Myrashkina", 123548, "C32-onl", 18),
                new Student("Sergey", "Berdnikau", 786543, "C32-onl", 36),
                new Student("Daniil", "Bashkir", 952346, "C32-onl", 27),
                new Student("Sergey", "Lopatin", 987654, "C32-onl", 32),
                new Student("Alex", "Petrushkin", 456321, "C32-onl", 21),
                new Student("Olga", "Mishkina", 665432, "C32-onl", 28),
                new Student("Dima", "Zazulia", 654876, "C32-onl", 31),
                new Student("Kate", "Smirnova", 654987, "C32-onl", 25),
                new Student("David", "Petrovich", 321987, "C32-onl", 34)
        };

        StudentOption.showAllStudents(groupStudents);

    }

}
