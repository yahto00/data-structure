package com.yahto.stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by yahto on 24/11/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GetMinStackTest {
    @Resource
    private GetMinStack getMinStack;

    @Test
    public void test() {
        getMinStack.push(1);
        System.out.println(getMinStack.getMin());
    }
}
