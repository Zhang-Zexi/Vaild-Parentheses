import java.util.Stack;

/**
 * @ClassName Solution
 * @Description
 * @Author zhangzx
 * @Date 2019/3/27 11:18
 * Version 1.0
 **/
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('|| c == '[' || c == '{') {
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else {
                    char topChar = stack.pop();
                    if(c == ')' && topChar != '(') {
                        return false;
                    }else if(c == ']' && topChar != '[') {
                        return false;
                    }else if(c == '}' && topChar != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
