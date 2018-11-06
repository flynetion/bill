package com.test;

public class Test {

    @org.junit.Test
    public void test() {
        Integer a = 178;
        checkParam(a);
        System.out.println(a);
    }

    @org.junit.Test
    public void test1() {
        System.out.println(cc());
    }

    public void checkParam(Integer integer) {
        if (integer < 1) {
            integer += 1;
        } else if (integer > 127) {
            integer += 1;
        }
    }

    public Boolean cc() {
        try {
            return true;
        } catch (Exception e) {
            return true;
        } finally {
            return false;
        }
    }
}
