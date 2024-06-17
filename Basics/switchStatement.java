public class switchStatement {
    public static void main(String[] args) {
        int value =7;
        // Old switch statement:
        switch(value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3,4 or 5");
                break;
            default:
                System.out.println("Neither 1,2,3,4 or 5");
                break;
        }
        System.out.println(getQuarter("SE"));

        // Enhanced switch statement:
        switch(value){
            case 1-> System.out.println("Value was 1");
            case 2-> System.out.println("Value was 2");
            case 3,4,5-> System.out.println("Was 3,4 or 5");
            default-> System.out.println("Neither 1,2,3,4, or 5");
        }
    }

    public static String getQuarter(String month){
        // switch (month){
        //     case "JANUARY":
        //     case "FEBRUARY":
        //     case "MARCH":
        //         return "1st";
        //     case "APRIL":
        //     case "MAY":
        //     case "JUNE":
        //         return "2nd";
        //     case "JULY":
        //     case "AUGUST":
        //     case "SEPTEMBER":
        //         return "3rd";
        //     case "OCTOBER":
        //     case "NOVEMBER":
        //     case "DECEMBER":
        //         return "4th";
        //     default:
        //         return "bad";
        // }

        // Enhanced switch statement can be returns a value that can be returned, ie, it can be 
        // used as an expression as well;

        // return switch(month){
        //     case "JANUARY","FEBRUARY","MARCH"->"1st";
        //     case "APRIL","MAY","JUNE"->"2nd";
        //     case "JULY","AUGUST","SEPTEMBER"->"3rd";
        //     case "OCTOBER","NOVEMBER","DECEMBER"->"4th";
        //     default->"bad";
        // }; // semicolon is mandatory in enhanced switch statement while returning

        // Another way (making use of yield; can only be used in code blocks):
        return switch(month){
            case "JANUARY","FEBRUARY","MARCH"->"1st";
            case "APRIL","MAY","JUNE"->"2nd";
            case "JULY","AUGUST","SEPTEMBER"->"3rd";
            case "OCTOBER","NOVEMBER","DECEMBER"->"4th";
            default->{
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
