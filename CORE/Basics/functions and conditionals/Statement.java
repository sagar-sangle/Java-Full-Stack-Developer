public class Statement {
    enum days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
     }

    public static void main(String[] args) {
        /*
         * 1)yield statement : The Yield Statement
    The last branching statement is the yield statement. 
    The yield statement exits from the current switch expression it is in. 
    A yield statement is always followed by an expression that must produce a value. 
    This expression must not be void. The value of this expression is the value produced by the enclosing switch expression.
         */
        

     System.out.println("days to work untill weekend : "+calculate(days.MONDAY));

       
    }
    public static int calculate(days d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> 0;
            default -> {
                int remainingWorkDays = 5 - d.ordinal();
                yield remainingWorkDays;
            }
        };
    }
    
}
