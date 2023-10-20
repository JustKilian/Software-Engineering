import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
    public static int calculateAge(Date birthday) {
        LocalDate birthdate = LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDay());
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthdate, now);
        return period.getYears();
    }
}
