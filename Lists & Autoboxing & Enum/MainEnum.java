import java.util.*;

public class MainEnum {
    public static void main(String[] args) {
        DaysOfTheWeek weekDay = DaysOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i=0;i<10;i++){
            weekDay = getRandomDay();
            System.out.printf("Name is %s, ordinal value = %d%n",weekDay.name(),weekDay.ordinal());
            if(weekDay==DaysOfTheWeek.FRI){
                System.out.println("Found a Friday!!");
            }
        }

        switchDayOfTheWeek(getRandomDay());

        for(ToppingEnum topping: ToppingEnum.values()){
            System.out.println(topping.name()+" : "+topping.getPrice());
        }
    }

    public static DaysOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values(); // This will return an array of values
        return allDays[randomInteger];
    }

    public static void switchDayOfTheWeek(DaysOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1;
        switch(weekDay){
            case WED -> System.out.println("Wednesday is day "+weekDayInteger);
            case SAT -> System.out.println("Saturday is day "+weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+
            weekDay.name().substring(1).toLowerCase()+"day is Day "+weekDayInteger);
        }
    }
}
