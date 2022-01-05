package education.util;

import education.model.Lesson;
import education.model.Student;
import education.model.User;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtil {

    private static final String DATA_PATH = "C:\\Users\\Hovhanes Gevorgyan\\IdeaProjects\\JavaCore\\src\\education\\data";

    public static void serializeLesson(List<Lesson> lessonList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\lessons.txt"))) {
            out.writeObject(lessonList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void serializeStudent(List<Student> studentList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\students.txt"))) {
            out.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void serializeUser(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\users.txt"))) {
            out.writeObject(userMap);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Lesson> deserializeLesson(){
        File file = new File(DATA_PATH + "\\lessons.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                List<Lesson> list = (List<Lesson>) in.readObject();
                return list;
            }catch (EOFException e){

            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public static List<Student> deserializeStudent(){
        File file = new File(DATA_PATH + "\\students.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
                List<Student> list = (List<Student>) in.readObject();
                return list;
            }catch (EOFException e){

            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return null;
    }


    public static Map<String, User> deserializeUser(){
        File file = new File(DATA_PATH + "\\users.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
                return (Map<String, User>) in.readObject();
            }catch (EOFException e){

            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return null;
    }

}
