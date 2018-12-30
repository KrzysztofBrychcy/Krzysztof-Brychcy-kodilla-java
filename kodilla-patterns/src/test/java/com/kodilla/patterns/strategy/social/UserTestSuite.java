package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Give
        User krysek = new Millenials("Krysek");
        User marco = new YGeneration("Polo");
        User majka = new ZGeneration("Bee");

        //When
        String krysekSocial = krysek.sharePost();
        System.out.println("Krysek posts: " + krysekSocial);
        String marcoSocial = marco.sharePost();
        System.out.println("Marco posts: " + marcoSocial);
        String majkaSocial = majka.sharePost();
        System.out.println("Majka posts: " + majkaSocial);

        //Then
        Assert.assertEquals("[Facebook Publisher] add a photo", krysekSocial);
        Assert.assertEquals("[Twitter Publisher] add a twit", marcoSocial);
        Assert.assertEquals("[Snapchat Publisher] add a snap", majkaSocial);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Give
        User krysek = new Millenials("Krysek");

        //When
        String krysekSocial = krysek.sharePost();
        System.out.println("Krysek posts: " + krysekSocial);
        krysek.setSocialPublisher(new SnapchatPublisher());
        krysekSocial = krysek.sharePost();
        System.out.println("Krysek now posts: " + krysekSocial);

        //Then
        Assert.assertEquals("[Snapchat Publisher] add a snap", krysekSocial);
    }
}
