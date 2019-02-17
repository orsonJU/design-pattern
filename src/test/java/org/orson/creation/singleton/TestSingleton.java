package org.orson.creation.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.orson.creation.singleton.hungry.HungrySingleton;
import org.orson.creation.singleton.lazy.LazySingleton;
import org.orson.creation.singleton.register.Person;
import org.orson.creation.singleton.register.RegisterSingleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by orson on 2018/9/8.
 */
public class TestSingleton {


    /**
     * 单例模式通常获取的是它自身的一个实例对象
     */
    @Test
    public void test_hungry() {
        final Set<HungrySingleton> instance = new HashSet<>();
        // 计数等待
        final CountDownLatch latch = new CountDownLatch(1000);
        for(int i = 0; i < 1000; i++) {

            new Thread(new Runnable(){
                @Override
                public void run() {
                    HungrySingleton hs = HungrySingleton.getInstance();
                    instance.add(hs);
                    latch.countDown();
                }
            }).start();

        }
        try {
            latch.await();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        // true if the instance set only has 1 person
        Assert.assertTrue("Failed..", instance.size() == 1);
    }


    @Test
    public void test_lazy() {
        final Set<LazySingleton> instance = new HashSet<>();
        // 计数等待
        final CountDownLatch latch = new CountDownLatch(1000);
        for(int i = 0; i < 1000; i++) {

            new Thread(new Runnable(){
                @Override
                public void run() {
                    LazySingleton ls = LazySingleton.getInstance();
                    instance.add(ls);
                    latch.countDown();
                }
            }).start();

        }
        try {
            latch.await();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        // true if the instance set only has 1 person
        Assert.assertTrue("Failed..", instance.size() == 1);

    }



    /**
     * 注册式的单例模式测试：
     * 模拟1000个线程同时获取一个Person单例，保证每个线程获取的都是同一个
     */
    @Test
    public void test_register() {
        /**
         * 所有结构都应该是相同的
         */
        final Set<Person> instance = new HashSet<>();
        // 计数等待
        final CountDownLatch latch = new CountDownLatch(1000);
        for(int i = 0; i < 1000; i++) {

            new Thread(new Runnable(){
                @Override
                public void run() {
                    Person person = RegisterSingleton.getInstance(Person.class);
                    instance.add(person);
                    latch.countDown();
                }
            }).start();

        }
        try {
            latch.await();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        // true if the instance set only has 1 person
        Assert.assertTrue("Failed..", instance.size() == 1);
    }
}
