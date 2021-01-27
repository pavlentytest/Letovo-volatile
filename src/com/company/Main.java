package com.company;

public class Main {

    private volatile boolean flag = false;

    // интерфейс игры
    Runnable gui = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Stoping GUI!!!");
        }
    };
    // логика игры
    Runnable logic = new Runnable() {
        @Override
        public void run() {
            while(!flag) {

            }
            System.out.println("Stoping game!!!");
        }
    };

    public void toStart() {
        new Thread(gui).start();
        System.out.println("Starting GUI!");
        new Thread(logic).start();
        System.out.println("Starting game!");

    }

    public static void main(String[] args) {
        new Main().toStart();

    }



}
