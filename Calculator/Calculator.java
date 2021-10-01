class Calculator {
    public void Display (){ // The purpose of this void method is to output a statement to the console as none void methodes can't due that.
        /*
         * Quadratic Formula
         */
        
        int a = 1; //a is the coeffieceint of the leading term.
        int b = 5; //b is the coeffiecent of the second term.
        int c = 6; //c is the constant and the y-intercept.
    
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " +  quadraticFormulaS(a, b, c) + " and " + quadraticFormulaA(a, b, c) + ".");
        System.out.println();
        
        /*
         * Slope Formula
         */
        
        //Variables: These variables will be used again for midpoint
        int y1 = 0; //y1 = the y value corresponding with x1
        int y2 = 3; //y2 = the y value corresponding with x2
        int x1 = 0; //x1 = the x value corresponding with y2
        int x2 = 2; //x2 = the x value corresponding with y2
        
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ") has a slope of " + slopeFormula(x1,y1,x2,y2));
        System.out.println();
        
         /*
         * Midpoint Formula
         */
        int y3 = y1; //An arbitrary y value corresponding x3: This is the intended same as y1 as the output is the same.
        int y4 = y2; //An arbitrary y value corresponding x4: This is the intended same as y2 as the output is the same.
        int x3 = x1; //An arbitrary x value corresponding y3: This is the intended same as x1 as the output is the same.
        int x4 = x2; //An arbitrary x value corresponding y4: This is the intended same as x2 as the output is the same.
        
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is " + "(" + midpointFormulaX(x3, x4) + ", " + midpointFormulaY(y3,y4) + ")");
        System.out.println();
        
        /*
         * Arthmetic Series Formula
         */
        
        //Variables
        double firstValue = 1;       //First Value of
        double commonDifference = 1; //The slope of the values relative to number of terms
        int num = 5;                 //number of terms
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + num + " terms of an arithmetic series that starts with "+ firstValue);  
        System.out.println("and increases by " + commonDifference +" is " + arthmeticSeriesFormula(firstValue,commonDifference,num));
        System.out.println();
        
        /*
         * Geometric Series Formula
         */
        
        //Variables
        double intialValue = 3; //Starting Value of the series 
        double commonRatio = 2; //Common constant ratio of the series that is raised to a power n.
        int n = 3;              //Number Of Terms
        
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + n + " terms of a finite geometric series that starts with " + intialValue);
        System.out.print("and increases by a rate of " + commonRatio + " is " + geometricSeriesFormula(intialValue,commonRatio,n));
    
    }
    
    public double quadraticFormulaS (int a, int b, int c){ // This is the methode responsilbe for the Quadratic Formula Output: Subtract
        double rootAdd;      //Value of x-intercept when you   add    the Square Root of 4ac; Larger x-intercept value
        double rootSubtract; //Value of x-intercept when you subtract the Square Root of 4ac; Smaller x-intercept Value
        
        //Please note, the reason I used inside is to be able to back track logic errors.
        double inside = Math.pow(b, 2.0) - 4 * a * c; 
        
        //Quadratic Formula: Simplified
        rootSubtract = (- 1 * b - Math.sqrt(inside)) / (2 * a);
        
        return (rootSubtract);
    }
    
    public double quadraticFormulaA (int a, int b, int c){ // This is the methode responsilbe for the Quadratic Formula Output: Add
        double rootAdd;      //Value of x-intercept when you   add    the Square Root of 4ac; Larger x-intercept value
        double rootSubtract; //Value of x-intercept when you subtract the Square Root of 4ac; Smaller x-intercept Value
        
        //Please note, the reason I used inside is to be able to back track logic errors.
        double inside = Math.pow(b, 2.0) - 4 * a * c; 
        
        //Quadratic Formula: Simplified
        rootAdd = (-1 * b + Math.sqrt(inside)) / (2 * a);
        
        return (rootAdd);
    }
    
    public double slopeFormula (int x1, int y1,int x2, int y2){ // This is the methode responsilbe for the slope output
        //Linear Formula 
        double m= (double)(y2 - y1) / (x2 - x1); //Difference qoutient for the difference of two points in space.
        return (m);
    }
    
    public double midpointFormulaX (int x3, int x4){  // This is the methode responsilbe for the midpoint:x
        //Linear Formula 
        double xMid = (double)(x3 + x4) / 2; //Average of the two y values

        return (xMid);
    }
    
    public double midpointFormulaY (int y4, int y3){ // This is the methode responsilbe for the midpoint: y
        //Linear Formula 
        double yMid = (double)(y3 + y4) / 2; //Average of the two y values

        return (yMid);
    }
    
    public double arthmeticSeriesFormula (double firstValue, double commonDifference, int num){ // This is the methode responsilbe for the arthmetic series formula
        //Arthmetic Sum Formula w/ common ratio, initial value, and number of terms
        double arthSeriesValue = ((double)num/2) * (2 * firstValue + commonDifference * ( num - 1));
        return(arthSeriesValue);
    }
    
    public double geometricSeriesFormula (double intialValue, double commonRatio, int n){ // This is the methode responsilbe for the geometric series formula
        //Geometric Sum Formula w/ common ratio, initial value, and number of terms
        double geoSeriesValue = intialValue * (Math.pow(commonRatio,n)-1)/(commonRatio-1);
        return(geoSeriesValue);
    }
}