package com.kodilla.exception.nullpointer;

public class NullPointerExcepitonRunner {
    public static void main (String args[]){
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Siemandero!");
        }catch(MessageNotSendException e){
            System.out.println("Message not send, but my program still runnign out");
        }

        System.out.println("Procesing other logic!");
    }
}
