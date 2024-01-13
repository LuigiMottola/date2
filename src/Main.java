import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //creating offset
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //formatting
        String formattedDate = offsetDateTime1.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(formattedDate);
    }
}
