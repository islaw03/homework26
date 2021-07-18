package com.company;

public class OtherClimbableAnimal implements Climbable{
    @Override
    public void climb() {}

    @Override
    public String toString(){
        return "Я другое животное из класса \" OtherClimbableAnimal\" которое тоже умеет карабкаться";
    }
}
