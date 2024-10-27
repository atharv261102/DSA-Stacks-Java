import java.util.Stack;

public class ValidParentheses
{
  public static void main(String ...args)
  {
    String s1=new String("([{}])");
    System.out.println("Is s1 Valid?-> " + new ValidParentheses().isValid(s1));
  }

  public boolean isValid(String s){
     Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(!st.empty()){
                    char toCheck=st.pop();
                    if(toCheck=='('&&ch==')'||toCheck=='['&&ch==']'||toCheck=='{'&&ch=='}') continue;
                    else return false;
                }
                else return false;
            }
        }
        if(!st.empty()) return false;
        return true;
  }
}