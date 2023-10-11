package task1;

public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("javaErHvad")) {
            System.out.println("b");
            methodB("javaErHvad");
        } else {
            System.out.println("a");
            if (methodC(input) == 10) {
                System.out.println("r");
            }
        }
        System.out.println("s");
        System.out.println("j");
        System.out.println("o");
        if(input.equals("javaErHvad")){
            System.out.println("v");
            System.out.println("t");
        }
    }
    public void methodB(String start) {
        System.out.println("c");
    }
    public int methodC(String input) {
        System.out.println("v");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("a");
        if (number > 11) {
            System.out.println("g");
        }
        System.out.println("e");
        System.out.println("r");
    }
}