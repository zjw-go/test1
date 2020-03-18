package com.zjw.test;

public class HelloSpring {

    private String who = null;

    public void print() {
        System.out.println("Hello," + getWho() + "!");
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
