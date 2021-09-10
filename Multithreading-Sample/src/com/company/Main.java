package com.company;

class FirstThread extends Thread
{

    public void run(){

        for (int i = 0; i < 10; i++) {
            System.out.println("First Thread is Working");
            try {Thread.sleep(1000);}  catch ( Exception e){};
        }
    }
}

class SecondThread extends Thread
{

    public void run(){

        for (int i = 0; i < 10; i++) {
            System.out.println("Second Thread is Working");
            try {Thread.sleep(1000);}  catch ( Exception e){};
        }
    }
}


public class Main {

    public static void main(String[] args) {

        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();

        first.start();
        try {Thread.sleep(10);}  catch ( Exception e){};
        second.start();

    }
}
