package com.pollen;

import com.pollen.prototype.Rabbit;
import com.pollen.singleton.Singleton;

/**
 * Client!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //clientSingleton();
        clientPrototype();
    }

    private static void clientPrototype() {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Pollen");
        try {
            Rabbit rabbitCopy = rabbit.clone();
            // Testing the shallow copy.
            System.out.println("Name of first owner: " + rabbit.getOwner().getName());
            System.out.println("Name of Second owner: " + rabbitCopy.getOwner().getName());

            // Stress testing the shallow copy.
            rabbitCopy.getOwner().setName("Prash");
            System.out.println("Name of first owner: " + rabbit.getOwner().getName());
            System.out.println("Name of Second owner: " + rabbitCopy.getOwner().getName());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning error.");
        }
    }

    private static void clientSingleton() {
        if(Singleton.getInstance() != null) {
            System.out.println("Singleton initialized");
        }
    }
}
