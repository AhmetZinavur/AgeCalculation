package age_calculation;

import java.time.LocalDate;
import java.time.Period;

public class Age {

    public int calculateAge(int year, int month, int day) {

        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        int years = Period.between(birthdate, now).getYears();
        return years;

    }
}
