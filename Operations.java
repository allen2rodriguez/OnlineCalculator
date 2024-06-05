public class Operations {
    //Variable holds the memory  value
    private double memory;

    /*========== Arithmetic Operations ==========*/
    //add
    public static add(double a, double b) {
        return a + b;
    }

    //subtract 
    public static sub(double a, double b) {
        return a - b;
    }

    //multiply 
    public static multi(double a, double b) {
        return a * b;
    }

    //divide
    public static div(double a, double b) {
        if (b == 0) {
            return system.out.Println("Cannot divide by 0")
        } else {
            return a / b;
        }
    }

    //modulus
    public static mod(double a, double b) {
        if (b == 0) {
            return system.out.Println("Cannot divide by 0")
        } else {
            return a % b;
        }
    }

    //exponentiation
    public static exp(double a, double b) {
        //Enter the math.exp or whatever it is
    }

    //square root
    public static root(double a) {
        //enter math.sqreroot or whatever it is
    }

    //factorial
    public static fac(int a) {
        //Consider adding a if statment to check if the thing is a int
        while (a > 1) {
            return a * fac(a-1);
        }
    }


    /*============= Memory Function ================*/
    //Constructor to initilize memory: Might need its own class 
    public void MemoryCalculator() {
        this.memory = 0;
    }

    //Clear 
    public void clear() {
        this.memory = 0;
    }

    //Recall memory (AKA: ANS)
    public doudble memoryRecall() {
        reurn this.memory;
    } 

    //Alternate betweem 
}
