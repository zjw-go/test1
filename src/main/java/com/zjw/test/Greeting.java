package com.zjw.test;

public class Greeting {
    //说话的人
    private String person = null;
    //说话的内容
    private String words = null;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    /**
     * 说话的方法
     */
    public void sayGreeting(){
        System.out.println(person + "说：“" + words + "”");
    }
}
