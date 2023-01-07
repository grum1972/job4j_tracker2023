package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sumScore = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
                count++;
            }
        }
        return sumScore / (double) count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), sumScore / (double) pupils.size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), (prev, one) -> prev + one);
            }
        }
        for (String s : map.keySet()) {
            labels.add(new Label(s, map.get(s) / (double) pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sumScore = 0;
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), sumScore));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), (prev, one) -> prev + one);
            }
        }
        for (String s : map.keySet()) {
            labels.add(new Label(s, map.get(s)));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
