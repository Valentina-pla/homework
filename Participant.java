package Jsles1;

public class Participant {
    private String name;
    private int age;
    private int height;

    public Participant(String name, int age, int height) {
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public void print(){
        System.out.println(this.name+" "+this.age+" "+this.height);
    }
}
