package CollectionFrameWork.LegecyClasses;

import java.util.Stack;

public class StackDemo {


    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("aman");
        s.push("agra");
        s.push("rajeev");
        System.out.println("stack "  + s);
        s.pop();
        System.out.println("stack "  + s);
    }
}
