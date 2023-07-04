public class control {
    public static void main(String[] args) {
            int currentHours = 14;
            int currentMinutes = 34;
            int currentSeconds = 42;

            // Calculate the total seconds elapsed from the current time
            int totalSecondsElapsed = currentHours * 3600 + currentMinutes * 60 + currentSeconds;

            // Calculate the total seconds in a day (24 hours)
            int totalSecondsInDay = 24 * 3600;

            // Calculate the remaining seconds in the day
            int remainingSeconds = totalSecondsInDay - totalSecondsElapsed;

            System.out.println("Remaining seconds in the day: " + remainingSeconds);
        }
    }


