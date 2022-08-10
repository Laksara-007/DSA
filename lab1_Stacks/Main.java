package lab1_Stacks;

public class Main {
    public static void main(String[] args) {
//        lab1.Stack stack1 = new lab1.Stack(5);
//        stack1.push('A');
//        stack1.push('B');
//        stack1.push('C');
//        stack1.push('D');
//        stack1.push('E');
//        stack1.push('E');
//
//        while (!stack1.isEmpty()){
//            System.out.println(stack1.pop());
//        }
        BracketCheck br = new BracketCheck("((4564))");
        br.check();

    }
}