package Chapter7.practice;

public class Stack {
    private int stck[];
    private int index;

    Stack(int size) {
        stck = new int[size];
        index = -1;
    }

    void push(int item) {
        if (index == stck.length - 1)
            System.out.println("stack is full");
        else
            stck[++index] = item;
    }

    int pop(){
        if(index < 0){
            System.out.println("stack is empty");
            return 0;
        }else
            return stck[index--];
    }
}

class TestStack{
    public static void main(String[] args) {

        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);


        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        for (int i = 0; i < 5; i++)
            System.out.print(mystack1.pop() + " ");
        System.out.println();
        for (int i = 0; i < 8; i++)
            System.out.print(mystack2.pop() + " ");


    }
}