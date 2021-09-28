public class Time {
    public static void main(String[] args)
    {
        int hour = 16;
        int minute = 30;
        int second = 29;

        /**
         * Number of Seconds During Midnight
         */
        System.out.print("The number of seconds since midnight is ");
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println(secondsSinceMidnight);

        /**
         * Number of Seconds Remaining in the Day
         */
        System.out.print("The number of seconds remaining in the day is ");
        System.out.println(60 * 60 * 24 - secondsSinceMidnight);

        /**
         * Percentage of Day That Has Passed
         */
        System.out.print("The percentage of the day that has passed is ");
        System.out.println(secondsSinceMidnight/86400.0 * 100 + "%");

        /**
         * Elapsed Time of Exercise
         */
        int startTime = secondsSinceMidnight;
        hour = 16;
        minute = 43;
        second = 17;
        int endTime = hour * 3600 + minute * 60 + second;
        int elapsedTime = endTime - startTime;
        int hoursElapsed = elapsedTime/3600;
        int minutesElapsed = (elapsedTime - hoursElapsed * 3600)/60;
        int secondsElapsed = (elapsedTime - (hoursElapsed * 3600 + minutesElapsed * 60));
        System.out.print("The total amount of time that I have spent on this exercise is ");
        System.out.print(hoursElapsed + " hours ");
        System.out.print(minutesElapsed + " minutes ");
        System.out.println(secondsElapsed + " seconds ");
    }
}
