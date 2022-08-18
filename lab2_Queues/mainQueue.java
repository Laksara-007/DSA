package lab2_Queues;

import java.util.Scanner;

public class mainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QueueX printerQueue = new QueueX(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter transaction ID " + (i + 1) + ": ");
            printerQueue.insert(sc.nextInt());
        }

        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);

        for (int i = 0; i < 5; i++) {
            int temp = printerQueue.remove();
            if (temp % 2 == 0) {
                evenQueue.insert(temp);
            } else {
                oddQueue.insert(temp);
            }
        }
        System.out.println("PC1: ");
        while (!evenQueue.isEmpty()) {
            System.out.println("    Transaction " +evenQueue.remove());
        }
        System.out.println("PC2: ");
        while (!oddQueue.isEmpty()) {
            System.out.println("    Transaction " +oddQueue.remove());
        }
    }
}
