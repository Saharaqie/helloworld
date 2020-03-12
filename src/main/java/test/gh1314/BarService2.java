package test.gh1314;

import org.osgl.mvc.annotation.PostAction;

public class BarService2 {
    private int a;
    @PostAction("/bars3")
    public Bar create(Bar bar) {
        return bar;
    }
}
