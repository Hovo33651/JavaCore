package Homework.arrayutil;

public class ArrayHelloJava {
    public static void main(String[] args) {

        char[] barev = {' ', ' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', ' ',
                'j', 'a', 'v', 'a', ' ', ' '};

        // Գրել կոդ, որը կջնջի միայն սկզբի ու վերջի պռոբելները
        int index = 0;
        int i = 0;
        char[] result = new char[barev.length];
        for (i = 0; i < barev.length; i++) {
            if (barev[i] == ' ')
                continue;
            else if(barev[i] != ' ') {
                index++;
                result[index] = barev[i];
                break;
            }
        }
            for (int j = i; j < barev.length; j++) {
                if (barev[j] == ' ') {
                    index++;
                    result[index] = barev[j];
                }
                else if (barev[j] != ' ') {
                    index++;
                    result[index] = barev[j];
                }
                System.out.print(result[index]);
            }
        }
    }





