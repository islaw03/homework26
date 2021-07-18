package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//ПОЛНАЯ КАША ))))
public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter 'eatable' or 'not eatable!");
        String fruit = scann.next();
        Monkey monkey = new Monkey();
        monkey.setFruit(fruit);
        monkey.carry();
        monkey.climb();
        monkey.eat();
    }
}
