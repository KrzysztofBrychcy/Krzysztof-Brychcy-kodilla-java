package com.kodilla.good.patterns.challanges;

public class SmsService implements InformationService {

    public void inform(final User user, final Product product) {

        System.out.println("Sending SMS to: " + user.getUserName() + " on number: " + user.getPhoneNumber());
        System.out.println("Hello " + user.getUserName() + " " + user.getUserSurname()
                + ". You have bought a: " + product.getProductName() + " in quantity of: " + product.getProductQuantity());
    }
}
