public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int codePerDay = 6;
        int semesterWeeks = 17;
        int codeHoursInSemester = codePerDay*5*semesterWeeks;
        int workHoursWeekly = 52*17;
        int percentage = codeHoursInSemester*100/workHoursWeekly;
        System.out.println(codeHoursInSemester);
        System.out.println(percentage);

    }
}

