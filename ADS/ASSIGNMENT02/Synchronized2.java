package org.example;

class Table {
    // Synchronized method to print the multiplication table
    public  void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class Thread1 extends Thread {
    Table t;

    public Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t;

    public Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(8);
    }
}

public class Synchronized2 {

    public static void main(String[] args) {
        // Create a shared Table object
        Table obj = new Table();

        // Create two threads, both sharing the same Table object
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        // Start the threads
        t1.start();
        t2.start();
    }
}
