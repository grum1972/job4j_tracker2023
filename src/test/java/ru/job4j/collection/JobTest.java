package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemDescByName;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        jobs.sort(new JobAscByName());
        assertThat(jobs.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        jobs.sort(new JobDescByPriority());
        assertThat(jobs.toString()).isEqualTo(expected.toString());
    }
}