package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int i = 0; i < count - 1; i++) {
            queue.poll();
        }
        Customer happy = queue.poll();
        return happy != null ? happy.name() : "";
    }

    public String getLastUpsetCustomer() {
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
        Customer last = queue.poll();
        return last != null ? last.name() : "";
    }
}

