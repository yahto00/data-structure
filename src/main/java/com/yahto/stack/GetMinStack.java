package com.yahto.stack;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by yahto on 24/11/2017.
 * 实现一个特殊栈，在实现栈的基本功能的基础上，再实现返回栈中最小的元素
 */
@Component
public class GetMinStack {
    /**
     * 存放数据的栈
     */
    private Stack<Integer> dataStack = new Stack<Integer>();
    /**
     * 存放最小值的栈
     */
    private Stack<Integer> minStack = new Stack<Integer>();

    /**
     * 压栈
     * @param data
     */
    public void push(Integer data) {
        if (size() == 0) {
            //第一个元素进栈
            dataStack.push(data);
            minStack.push(data);
        } else {
            dataStack.push(data);
            if (minStack.peek() > data) {
                minStack.push(data);
            } else {
                minStack.push(minStack.peek());
            }
        }

    }


    public Integer pop() {
        checkRange();
        minStack.pop();
        return dataStack.pop();
    }

    public Integer peek() {
        checkRange();
        return dataStack.peek();
    }

    public Integer size() {
        return dataStack.size();
    }

    public Integer getMin() {
        checkRange();
        return minStack.peek();
    }

    private void checkRange(){
        if (dataStack.size() == 0){
            throw new RuntimeException("there is no element left in the stack");
        }
    }
}
