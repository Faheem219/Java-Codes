public enum ToppingEnum { // Defining methods, since underneath enum is just a class
    MUSTARD, PICKLES, BACON, CHEDDAR, TOMATO; // need to add semicolon to define methods

    public double getPrice(){
        return switch(this){
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
