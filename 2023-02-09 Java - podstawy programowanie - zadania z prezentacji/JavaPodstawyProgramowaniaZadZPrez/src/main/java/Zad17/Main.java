package Zad17;
;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Please enter date of next SDA lesson im format dd-MM-yyyy");

        String dateOfLesson = input.nextLine();
        LocalDate currentDate = LocalDate.now();
        String formattedCurrentDate = currentDate.format(dateTimeFormatter);
        LocalDate parsedCurrentDate = LocalDate.parse(formattedCurrentDate,dateTimeFormatter);
        LocalDate parsedDateOfLesson = LocalDate.parse(dateOfLesson,dateTimeFormatter);

        System.out.println("Current date: " + parsedCurrentDate);
        System.out.println("Date of closest lesson: " + parsedDateOfLesson);
        System.out.println("You still have " + ChronoUnit.DAYS.between(parsedCurrentDate, parsedDateOfLesson) + " more days to study before next lesson at SDA" );







    }
}
