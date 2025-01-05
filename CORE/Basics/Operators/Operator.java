class Operator{

    public static void main(String[] args) {
        

        /*
         * assignment opertor
         * arithmatic operator 
         * unary operator
         * bitwise operator 
         * conditional opertor 
         * realtional operator
         * 
         */

         //expression : is a statement like a = 0 which gets evaluated

         /*
          * An expression is a construct made up of variables, operators, and method invocations,
           which are constructed according to the syntax of the language, that evaluates to a single value. 
           You have already seen examples of expressions, illustrated in code below:
          */

        /*
        
         * double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("d1 == 1 ? " + (d1 == 1.0));
        

         */
        double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("d1 == 1 ? " + (d1 == 1.0));//false due to represnetation error 
        // d1 will be slightly less than 1.0 (something like 0.9999999999999999), even though visually, it may seem close to 1.0.

    }
}