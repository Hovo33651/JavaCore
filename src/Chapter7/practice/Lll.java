package Chapter7.practice;

public class Lll {
    public static void main(String[] args) {
       /* Human h1 = new Human("John",25);
        Human h2 = new Human("Jack", 35);
        Human.description = "Nice";
        h1.getAllField();
        h2.getAllField();
        */
        System.out.println(Math.pow(2,5));
    }
}

class Human {
    private String name;
    private int age;

    public static String description;



    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public  void getAllField(){
        System.out.println(name + "," + age + "," + description);
    }



    }


