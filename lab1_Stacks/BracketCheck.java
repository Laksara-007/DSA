package lab1_Stacks;

public class BracketCheck {
    private String inp;
    public BracketCheck(String in){
        inp = in;
    }
    public void check(){
        int size = inp.length();
        Stack stack = new Stack(size);
        for (int i =0; i<size; i++){
            if(inp.charAt(i) == '('){
                stack.push('A');
            }
            else if(inp.charAt(i) == ')'){
                if (stack.isEmpty()){
                    System.out.println("invalid");
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
    }
}
