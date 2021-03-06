package com.kodilla.kodillapatterns2.facade.api;

public class OrderProcessingException extends Exception{

    public static String ERR_NOT_AUTHORISED = "User is not authorized";
    public static String ERR_PAYMEMT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUBMITING_ERROR = "Cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}
