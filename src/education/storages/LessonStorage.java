package education.storages;


import education.model.Lesson;

public class LessonStorage {

    Lesson[] lessons = new Lesson[10];
    int size = 0;



    public void add(Lesson lesson) {
        if (size == lessons.length)
            extend();
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }


    public Lesson getByName(String name) {
        int i;
        for (i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name))
                return lessons[i];

        }return lessons[i];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public void deleteByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                deleteByIndex(i);
            }
        }
    }

    private void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            lessons[i - 1] = lessons[i];
        }
        size--;
    }

    public void addLesson(Lesson lesson) {
        for (int i = 0; i < lessons.length; i++) {
            if (lessons[i] == null) {
                lessons[i] = lesson;
            }

        }
    }
}
