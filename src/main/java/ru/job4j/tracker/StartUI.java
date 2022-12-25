package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime dateCreated = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateCreatedDateTimeFormat = dateCreated.format(formatter);
        System.out.println("Дата создания записи : " + dateCreatedDateTimeFormat);
    }
}
