package Java_Functional_Programming_Questions.Bonus_Real_Life_Mini_Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Job {
    String name;
    String status;

    Job(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

public class Q55 {
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job1", "FAILED"));
        jobs.add(new Job("Job2", "SUCCESS"));
        jobs.add(new Job("Job3", "FAILED"));
        jobs.add(new Job("Job4", "SUCCESS"));
        jobs.add(new Job("Job5", "FAILED"));

        List<String> failedJobNames = getFailedJobNames(jobs);
        failedJobNames.forEach(System.out::println);
    }

    public static List<String> getFailedJobNames(List<Job> jobs) {
        return jobs.stream()
                .filter(job -> "FAILED".equals(job.getStatus()))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}

