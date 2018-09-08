package org.orson.singleton.register.test;

import org.orson.singleton.register.Person;
import org.orson.singleton.register.RegisterSingleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by orson on 2018/9/8.
 */
public class RegisterSIngletonTest {


    public static void main(String[] args) throws Exception {

        RegisterSingleton registry = new RegisterSingleton();


        final CountDownLatch latch = new CountDownLatch(1000);


        for(int i = 0; i < 1000; i++) {

            new Thread(new Runnable(){

                @Override
                public void run() {
                    Person person = registry.getInstance(Person.class);
                    System.out.println(person);
                    latch.countDown();
                }
            }).start();

        }


        latch.await();

    }
}
