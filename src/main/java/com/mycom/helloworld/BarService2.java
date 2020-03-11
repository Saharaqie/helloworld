package com.mycom.helloworld;

import org.osgl.mvc.annotation.PostAction;

public class BarService2 {
    private int a;
    @PostAction("/bars3")
    public Bar create(Bar bar) {
        return bar;
    }
}
