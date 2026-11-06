package com.tuf;

class Notification {
    public void sendNotification() {
        System.out.println("Sending notification ");
    }
}

class EmailNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification: ");
    }
}

class TextNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending text notification: ");
    }
}

public class LSP {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.sendNotification();

    }
}
