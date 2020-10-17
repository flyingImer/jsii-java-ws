package com.flyingimer.hello;

import org.cdk8s.plus.ServiceType;
import org.junit.jupiter.api.Test;

class WorldTest {
    private final World world = new World();

    @Test
    public void testSayHelloJsii() {
        System.out.println(world.callSayHelloJsii());
    }

    @Test
    public void testSayHello() {
        System.out.println(world.callSayHello());
    }

    @Test
    public void test() {
        System.out.println(ServiceType.CLUSTER_IP);
    }
}