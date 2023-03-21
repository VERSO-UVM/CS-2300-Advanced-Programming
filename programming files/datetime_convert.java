import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        // Create time as a string 
        String dateStr = "2022-03-17 10:45:30";
        
        // Format data into needed form
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Create time object using dateStr and formatter
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        
        // Convert object back into string
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        // Print newly formatted data as string
        System.out.println(formattedDate);
    }
}
