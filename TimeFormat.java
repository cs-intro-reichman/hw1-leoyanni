// Represents the hh:mm time format using an AM/PM format.
public class TimeFormat {
    public static void main(String[] args) {
        String time = args[0];
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        String period = "AM";

        if (hours >= 12) {
            period = "PM";
            if (hours > 12) {
                hours = hours - 12;
            }
        } 
        

        if (minutes < 10) {
            System.out.println(hours + ":0" + minutes + " " + period);
        } else {
            System.out.println(hours + ":" + minutes + " " + period);
        }
    }
}
