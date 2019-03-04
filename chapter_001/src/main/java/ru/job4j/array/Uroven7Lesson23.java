package ru.job4j.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */
/*

 */
public class Uroven7Lesson22 {

    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String name = reader.readLine();
            if (name.isEmpty())
                break;

            int age =  Integer.parseInt(reader.readLine());
            int weight =  Integer.parseInt(reader.readLine());
            int tailLength =  Integer.parseInt(reader.readLine());


            Cat cat = new Cat(name,age, weight,tailLength );
            CATS.add(cat);

        }



        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

         Cat(String name,int age, int weight, int tailLength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }


        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}