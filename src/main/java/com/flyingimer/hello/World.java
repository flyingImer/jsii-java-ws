package com.flyingimer.hello;

import com.acme.hello.Hello;
import com.acme.hello.HelloJsii;

public class World {

    public String callSayHelloJsii() {
        HelloJsii jsii = new HelloJsii();
        return jsii.sayHello("flyingImer");
    }

    public String callSayHello() {
        return new Hello().sayHello();
    }
}
