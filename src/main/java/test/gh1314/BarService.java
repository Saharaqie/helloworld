package test.gh1314;

import org.osgl.mvc.annotation.PostAction;

public class BarService {
    @PostAction("/bars")
    public Bar create(Bar bar) {
        return bar;
    }

    @PostAction("/bars2")
    public Bar create2(int id,Bar bar) {
        System.out.println(id);
        return bar;
    }
}
