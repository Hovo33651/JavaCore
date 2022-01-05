package education.storages;


import education.model.Lesson;
import education.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class LessonStorage {

    public List<Lesson> list = new LinkedList<>();


    public void add(Lesson lesson) {
        list.add(lesson);
        FileUtil.serializeLesson(list);
    }


    public Lesson getByName(String name) {
        for (Lesson lesson : list) {
            if (lesson.getName().equals(name)) {
                return lesson;
            }
        }
        return null;
    }

    public void print() {
        for (Lesson lesson : list) {
            System.out.println(lesson);
        }
    }

    public void deleteByName(String name) {
        list.removeIf(lesson -> lesson.getName().equals(name));
        FileUtil.serializeLesson(list);

    }
    public void initData(){
       list = FileUtil.deserializeLesson();
    }
}
