package jianzhi;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: xhh
 * @Date: 2020/8/22 11:09
 * @Version 1.0
 */
public class CQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();

    }

    /**
     * 入队
     * @param value
     */
    public void appendTail(int value) {
        stack1.push(value);
    }

    /**
     * 出队
     * @return
     */
    public int deleteHead() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            return -1;
        }

        return stack2.pop();


    }

}
