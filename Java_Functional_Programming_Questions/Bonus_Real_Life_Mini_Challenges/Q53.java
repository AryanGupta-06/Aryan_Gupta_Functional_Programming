package Java_Functional_Programming_Questions.Bonus_Real_Life_Mini_Challenges;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q53 {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 5, 7),
                LocalDate.of(2021, 1, 15),
                LocalDate.of(2022, 8, 23),
                LocalDate.of(2024, 12, 31)
        );

        // Custom comparator for LocalDate
        Comparator<LocalDate> dateComparator = (date1, date2) -> date1.compareTo(date2);

        // Find the earliest date
        LocalDate earliestDate = dates.stream()
                .min(dateComparator)
                .orElseThrow(() -> new RuntimeException("List is empty"));

        // Find the latest date
        LocalDate latestDate = dates.stream()
                .max(dateComparator)
                .orElseThrow(() -> new RuntimeException("List is empty"));

        System.out.println("Earliest Date: " + earliestDate);
        System.out.println("Latest Date: " + latestDate);
    }
}

