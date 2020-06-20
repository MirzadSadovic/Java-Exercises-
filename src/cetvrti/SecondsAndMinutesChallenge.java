package cetvrti;


public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        String result = getDurationString(65, 45); // ili u jednoj liniji -> System.out.println(getDurationString(65, 49));
        System.out.println(result);
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid value";
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hour + "h " + remainingMinutes + " m " + seconds + " s";
    }
    public static String getDurationString(int seconds){
        if(seconds <0 ){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
        
    }
}
