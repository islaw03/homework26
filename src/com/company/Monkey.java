package com.company;

import java.util.Scanner;

public class Monkey implements Climbable, Eatable, Carryable {
    private String Fruit;

    public String getFruit() {
        return Fruit;
    }

    public void setFruit(String fruit) {
        this.Fruit = fruit;
    }

    @Override
    public void carry() {
        System.out.println("I can carry n my back other climbable animal - " + new OtherClimbableAnimal());

    }

    @Override
    public void climb() {
        System.out.println("Ай кен климб");


    }

    @Override
    public void eat() {
        if (Fruit.equals("eatable")) {
            System.out.println("I eat eatable fruits");


        }else
            System.out.println("Я не буду есть этот фрукт, потому что он несъедобный");{

        }
    }
}