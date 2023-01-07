package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemTest {
    @Test
    public void whenAscSort() {
        List<Item> items = Arrays.asList(
               new Item("test1"),
               new Item("test3"),
               new Item("test2")
        );
        List<Item> expected = Arrays.asList(
                new Item("test1"),
                new Item("test2"),
                new Item("test3")
        );
        items.sort(new ItemAscByName());
        assertThat(items.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void whenDescSort() {
        List<Item> items = Arrays.asList(
                new Item("test1"),
                new Item("test3"),
                new Item("test2")
        );
        List<Item> expected = Arrays.asList(
                new Item("test3"),
                new Item("test2"),
                new Item("test1")
        );
        items.sort(new ItemDescByName());
        assertThat(items.toString()).isEqualTo(expected.toString());
    }

}