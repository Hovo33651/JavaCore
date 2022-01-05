package education.storages;

import education.model.Lesson;
import education.model.Student;
import education.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class StudentStorage {

    List<Student> students = new LinkedList<>();


    public void add(Student student) {
        students.add(student);
        FileUtil.serializeStudent(students);
    }


    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printByLesson(String name) {
        for (Student student : students) {
            for (Lesson lesson : student.getLessons()) {
                if(lesson.getName().equals(name)){
                    System.out.println(student);
                }
            }
        }
    }

    public Student getByEmail(String email) {
        for (Student student : students) {
            if(student.getEmail().equals(email))
                return student;
        }
        return null;
    }



    public void deleteByEmail(String email) {
        students.removeIf(student -> student.getEmail().equals(email));
        FileUtil.serializeStudent(students);
    }

    public void initData(){
        students = FileUtil.deserializeStudent();

    }

}