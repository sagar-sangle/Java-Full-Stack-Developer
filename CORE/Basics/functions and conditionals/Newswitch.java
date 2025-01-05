public class Newswitch {
    enum day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
     }

     public static String convertToLabel(int quarter) {
        String quarterLabel =
            switch (quarter) {
                case 0  -> {
                    System.out.println("Q1 - Winter");
                    yield "Q1 - Winter";//The yield statement is a statement that can be used in any case block of a switch statement. It comes with a value, that becomes the value of the enclosing switch statement.
                }
                default -> "Unknown quarter";
            };
            return quarterLabel;
        }
    

    public static void main(String[] args) {

        day d=day.FRIDAY;
        
int len = 0;
switch (d) {
    case MONDAY:
    case FRIDAY:
    case SUNDAY:
        len = 6;
        break;
    case TUESDAY:
        len = 7;
        break;
    case THURSDAY:
    case SATURDAY:
        len = 8;
        break;
    case WEDNESDAY:
        len = 9;
        break;
}
System.out.println("len = " + len);

//newer way of awriting switch case 

len= switch(d){
    case MONDAY,FRIDAY,SUNDAY->6;
    case TUESDAY                -> 7;
    case THURSDAY, SATURDAY     -> 8;
    case WEDNESDAY              -> 9;
};

System.out.println(len);
/*
 * The syntax of switch label is now case L ->. Only the code to the right of the label is executed if the label is matched.
 *  This code may be a single expression, a block, or a throw statement. Because this code is one block, you can define variables in it that are local to this particular block.

This syntax also supports multiple constants per case, separated by commas, as shown on the previous example.
 */

 //syntax if more than on statement

 /*
  * The syntax in the case of a block of code is a little different. Traditionally, the return keyword is used to denote the value produced by a block of code. Unfortunately this syntax leads to ambiguity in the case of the switch statement. Let us consider the following example. This code does not compile, it is just there as an example.
  */
//   // Be careful, this code does NOT compile!
// public String convertToLabel(int quarter) {
//     String quarterLabel =
//         switch (quarter) {
//             case 0  -> {
//                 System.out.println("Q1 - Winter");
//                 return "Q1 - Winter";
//             }
//             default -> "Unknown quarter";
//         };
//     return quarterLabel;
// }
/*
 * The block of code executed in the case where quarter is equal to 0 needs to return a value. 
 * It uses the return keyword to denote this value. If you take a close look at this code, you see that there are two return statements:
 *  one in the case block, and another one in the method block. This is where the ambiguity lies: one may be wondering what is the semantics of the first return. Does it mean that the program exits the method with this value? Or does it leave the switch statement? Such ambiguities lead to poor readability and error-prone code.
 */

 /*
  * A new syntax has been created to solve this ambiguity: the yield statement. The code of the previous example should be written in the following way.


    
The yield statement is a statement that can be used in any case block of a switch statement. It comes with a value, that becomes the value of the enclosing switch statement.

 
  */
  
  
System.out.println(Newswitch.convertToLabel(0));

}
}


