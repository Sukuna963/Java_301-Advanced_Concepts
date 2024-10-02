package org.example.exception;

public class CustomException {
    public static void main(String[] args) {
        try {
            Student someStudent = new Student();
            Classroom room = new Classroom();
            room.size = 20;
            addStudentToClassroom(someStudent, room);
        }catch (Custom exc) {
            System.out.println(exc.toString());
            System.out.println("You are unable to add this student");
        }
    }

    public static void addStudentToClassroom(Student student, Classroom classroom) throws Custom {
        if(classroom.size > 20) {
            classroom.addStudent(student);
        } else {
            throw new Custom();
        }
    }
}

class Student {}

class Classroom {
    int size;

    public void addStudent(Student student) {}
}