package src.Moduuli5.tehtavisto2;

import java.util.concurrent.locks.ReentrantLock;

class Customer {
    private int seatNumber;
    private int seatReserved;
    private int seatBuyNumber;

    public Customer(int seatNumber, int seatReserved) {
        this.seatNumber++;
        this.seatReserved++;
        this.seatBuyNumber = Math.random() < 0.5 ? 1 : 2;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getSeatReserved() {
        return seatReserved;
    }

    public int getTicketAmount() {
        return seatBuyNumber;
    }

    public static Customer generateCustomer(int seatNumber, int seatReserved) {
        return new Customer(seatNumber, seatReserved);
    }
}

class TicketSystem {
    int availableSeats = 100;
    ReentrantLock lock = new ReentrantLock();

    public void checkTransaction(int amount) {
        lock.lock();  // Acquire the lock
        try {
            if (availableSeats < amount) {
                System.out.println("Ei voitu ostaa paikkaa.");
            } else {
                availableSeats -= amount;
                System.out.println("Asiakas osti " + amount + " paikkaa. Jäljellä olevat paikat: " + availableSeats);
            }
        } finally {
            lock.unlock();  // Release the lock
        }
    }

    public void generateCustomers() {
        for (int i = 0; i < 100; i++) {  // Generate only as many customers as initial seats
            // Create customer thread and start it concurrently
            Thread customerThread = new Thread(() -> {
                Customer customer = Customer.generateCustomer(1, 1);
                checkTransaction(customer.getTicketAmount());
            });
            customerThread.start();
        }
    }
}


public class tehtava1 {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.generateCustomers();
    }
}