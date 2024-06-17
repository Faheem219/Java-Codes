public class secondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(75,30));
    }

    public static String getDurationString(int seconds){
        int minutes=seconds/60;
        return getDurationString(minutes,seconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours=minutes/60;
        
        int remMinutes=minutes%60;
        int remSeconds=seconds%60;

        return hours+"h "+remMinutes+"m "+remSeconds+"s";
    }
}
