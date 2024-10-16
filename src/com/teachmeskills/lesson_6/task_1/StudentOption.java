package com.teachmeskills.lesson_6.task_1;

public class StudentOption {
    /**
     *
     * @param students takes an array of objects of type students
     */
    public static void showAllStudents(Student[] students){
        System.out.println("INFORMATION ABOUT STUDENTS:");
        for (Student student : students) {
            System.out.printf("Name:%s\t Surname:%s\t Passport №%d\t Group name:%s\t Age:%d\n",
                    student.name, student.surname, student.passportNumber,student.groupName , student.age );
        }
    }
}
