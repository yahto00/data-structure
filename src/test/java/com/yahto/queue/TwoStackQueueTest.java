package com.yahto.queue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yahto on 25/11/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TwoStackQueueTest {
    @Autowired
    private TwoStackQueue twoStackQueue;

    @Test
    public void test() {
        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);
        twoStackQueue.add(4);
        twoStackQueue.add(5);
        twoStackQueue.add(6);
        twoStackQueue.add(7);
        int size = twoStackQueue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(twoStackQueue.poll());
        }
    }
}
