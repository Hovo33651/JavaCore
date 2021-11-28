package education;

public class StudentStorage {

    Student[] students = new Student[10];
    int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void printByLesson(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().getName().equals(name)) {
                System.out.println(students[i]);
            }
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email))
                return students[i];
        }
        return null;
    }

    public void deleteByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                deleteByIndex(i);
            }
        }
    }

    private void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            students[i - 1] = students[i];

        }
        size--;
    }
}