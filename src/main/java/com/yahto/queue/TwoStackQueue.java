package com.yahto.queue;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by yahto on 25/11/2017.
 * 用两个栈实现一个队列 支持基本操作 add poll peek
 */
@Component
public class TwoStackQueue {
    private Stack<Integer> inStack = new Stack<Integer>();
    private Stack<Integer> outStack = new Stack<Integer>();

    /**
     * 出队
     *
     * @return
     */
    public Integer poll() {
        checkRange();
        pourElement();
        return outStack.pop();
    }

    /**
     * 入队
     */
    public void add(Integer data) {
        inStack.push(data);
    }


    public Integer size() {
        return inStack.size() + outStack.size();
    }

    /**
     * 查看队头元素
     *
     * @return
     */
    public Integer peek() {
        checkRange();
        pourElement();
        return outStack.pop();
    }

    private void checkRange() {
        if (inStack.size() == 0 && outStack.size() == 0) {
            throw new RuntimeException("this is no element left in the stack");
        }
    }

    private void pourElement() {
        Integer inStackSize = inStack.size();
        for (int i = 0; i < inStackSize; i++) {
            outStack.push(inStack.pop());
        }
    }
}
