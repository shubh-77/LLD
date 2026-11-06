package com.tuf;

interface Keyboard {
    void connect();
}

class WiredKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Wired keyboard connected");
    }
}

class WirelessKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Wireless keyboard connected");
    }
}

class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start() {
        keyboard.connect();
        System.out.println("Computer started");
    }
}

public class DIP {
    public static void main(String[] args) {

        Computer computer1 = new Computer(new WiredKeyboard());
        computer1.start();

        Computer computer2 = new Computer(new WirelessKeyboard());
        computer2.start();
    }

}
