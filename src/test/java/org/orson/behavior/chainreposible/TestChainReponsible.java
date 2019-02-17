package org.orson.behavior.chainreposible;

import org.junit.Assert;
import org.junit.Test;
import org.orson.behavior.chainreponsible.AgeHandler;
import org.orson.behavior.chainreponsible.NameHandler;
import org.orson.behavior.chainreponsible.Request;

public class TestChainReponsible {

    @Test
    public void test_chain_reponsible() {
        // 先执行namehandler， 再执行agehandler
        AgeHandler ageHandler = new AgeHandler(null);
        NameHandler nameHandler = new NameHandler(ageHandler);

        Request request = new Request();
        nameHandler.handle(request);


        Assert.assertTrue("Failed", request.getAge() == 27);
        Assert.assertTrue("Failed", "orson".equals(request.getName()));
    }
}
