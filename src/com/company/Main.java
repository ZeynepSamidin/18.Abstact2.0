package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /** ±Класс Cow (weight, age, gender, nickName)
         ±Класс Sheep(weight, age, gender, nickName)
         ±Класс Horse(weight, age, color, gender, nickName)
         ±Класс Farm(address, cows, horses, sheep, OwnerName)
         ±2 Farm тузунуз.
         ±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
         ±2-Farmда 1 sheep, 1 cow, 1 horse болсун.*/


        Farm farm1 = new Farm("Moscow region, Podol'sk 26.", 6, 3, 4, "S. Orlov");
        System.out.println(farm1);

        Sheep sheep1 = new Sheep(20, 7, "f", "Saru");
        Sheep sheep2 = new Sheep(20, 7, "f", "Saru");
        Sheep sheep3 = new Sheep(20, 7, "f", "Saru");

        Cow cow1 = new Cow(100, 20, "f", "Zoya");
        Cow cow2 = new Cow(100, 20, "f", "Zoya");
        Cow cow3 = new Cow(100, 20, "f", "Zoya");
        Cow cow4 = new Cow(100, 20, "f", "Zoya");
        Cow cow5 = new Cow(100, 20, "f", "Zoya");

        Horse horse1 = new Horse(320, 25, "m", "Rani", "brown");
        Horse horse2 = new Horse(320, 25, "m", "Rani", "brown");

        Sheep sheep4 = new Sheep(20, 5, "f", "Chunak");
        Cow cow6 = new Cow(200, 24, "f", "Yulya");
        Horse horse3 = new Horse(400, 27, "m", "Vanya", "withe");

        Sheep[] sheep = {sheep1, sheep2, sheep3,};
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Horse[] horse = {horse1, horse2};


        Sheep[] sheepp = {sheep4};
        Cow[] cow = {cow6};
        Horse[] horses = {horse3};


        String[] farmm1 = new String[]{Arrays.toString(sheep)+ " " +Arrays.toString(cows)+ " " +Arrays.toString(horse)};
        String[] farmm2 = new String[]{Arrays.toString(sheepp)+ " " +Arrays.toString(cow)+ " " +Arrays.toString(horses)};


            for (String s : farmm1) {
                System.out.println("farmm1: " + s);

                for (String c : farmm2) {
                    System.out.println("farmm2: " + c);

                }
            }
        }
    }


