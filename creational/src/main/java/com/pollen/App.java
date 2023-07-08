package com.pollen;

import com.pollen.singleton.Singleton;

/**
 * Client!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        if(Singleton.getInstance() != null) {
            System.out.println("Singleton initialized");
        }
    }
}
