package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        HashSet<String> originSet = new HashSet<>();
        String[] words = originText.split(" ");
        String[] dublWords = duplicateText.split(" ");
        for (String word : words) {
            originSet.add(word);
        }
        for (String dublWord : dublWords) {
            if (!originSet.contains(dublWord)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
