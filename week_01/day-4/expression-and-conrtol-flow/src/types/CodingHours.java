package types;

public class CodingHours {
    public static void main(String[] args) {

        //An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int dailyCodingHours = 6;
        int daysInAWeek = 5;
        int weeksInSemester = 17;

        System.out.println("Hours spent by coding: " + (dailyCodingHours * daysInAWeek * weeksInSemester));
        int workingHoursInAWeek = 52;

        System.out.println("Total working hours in the semester:" + (workingHoursInAWeek * weeksInSemester));
        System.out.println("Percentage of the coding hours in a semester: " + (((dailyCodingHours * daysInAWeek * (double) weeksInSemester) / (workingHoursInAWeek * weeksInSemester)) * 100) + " %");

    }
}
