import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInDays {

    public static String ageInDays(int year, int month, int day) {
        long days = LocalDate.of(year, month, day).until(LocalDate.now(), ChronoUnit.DAYS);
        return String.format("You are %d days old", days);
    }

}

