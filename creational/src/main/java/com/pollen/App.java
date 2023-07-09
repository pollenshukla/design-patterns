package com.pollen;

import com.pollen.abstractfactory.AppLoginConfiguration;
import com.pollen.abstractfactory.AppLoginConfigurationFactory;
import com.pollen.abstractfactory.OsgiOauthConfiguration;
import com.pollen.abstractfactory.OsgiSamlConfiguration;
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
        //clientPrototype();
        clientAbstractFactory();
    }

    private static void clientAbstractFactory() {
        // Assume login is SAML.
        AppLoginConfigurationFactory loginFactory = new OsgiSamlConfiguration();
        AppLoginConfiguration loginConfiguration = loginFactory.createAppLoginConfiguration();
        System.out.println(loginConfiguration.getLoginConfig());

        // Assume login is Oauth.
        AppLoginConfigurationFactory loginFactory2 = new OsgiOauthConfiguration();
        AppLoginConfiguration loginConfiguration2 = loginFactory2.createAppLoginConfiguration();
        System.out.println(loginConfiguration2.getLoginConfig());
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
