class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            // 左括号：入栈
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // 右括号：检查栈
            else {

                // 栈为空，说明没有左括号可以匹配
                if (stack.isEmpty()) {
                    return false;
                }

                char cur = stack.pop();

                // 判断是否匹配
                if (c == ')' && cur != '(') {
                    return false;
                }

                if (c == ']' && cur != '[') {
                    return false;
                }

                if (c == '}' && cur != '{') {
                    return false;
                }
            }
        }

        // 最后栈必须为空
        return stack.isEmpty();
    }
}