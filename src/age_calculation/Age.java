package age_calculation;

import java.time.LocalDate;
import java.time.Period;

public class Age {
    
    private LocalDate birthdate;
    private LocalDate now;
    
    public int calculateAge(int year, int month, int day) {

        birthdate = LocalDate.of(year, month, day);
        now = LocalDate.now();
        int years = Period.between(birthdate, now).getYears();
        return years;

    }
}
