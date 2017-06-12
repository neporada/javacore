package com.kitcenter.app.classwork.lesson13;

/**
 * Created by denis on 6/7/17.
 */
public class Bicycle13 {
    public int wheelSize;
    public String color;
    private String name = "Commandor -2";
    private String frame;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bicycle13(){
        System.out.println("Override default constructor");
    }

    public Bicycle13(String name){
        this.name = name;
    }

    public Bicycle13(String name, String color){
        this(name);
        this.color = color;
    }

    public Bicycle13(int wheelSize, String color, String name) {
        this.wheelSize = wheelSize;
        this.color = color;
        this.name = name;
    }

    public Bicycle13(String name, int wheelSize, String color){
        this(wheelSize, color, name);
        this.printMe();
    }

    public void printMe(){
        System.out.println("Print");
    }

    private String showNameAndColor(){
        return name + " " + color;
    }
}
