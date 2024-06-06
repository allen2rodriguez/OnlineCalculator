public class Operations {
    //Variable holds the memory  value
    private double memory;

    /*========== Arithmetic Operations ==========*/
    //add
    public double add(double a, double b) {
        return a + b;
    }

    //subtract 
    public double sub(double a, double b) {
        return a - b;
    }

    //multiply 
    public double multi(double a, double b) {
        return a * b;
    }

    //divide
    public double div(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        } else {
            return a / b;
        }
    }

    //modulus
    public double mod(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        } else {
            return a % b;
        }
    }

    //exponentiation
    public double exp(double a, double b) {
        return Math.pow(a,b);
    }

    //square root
    public double root(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            reutrn Double.NaN;
        }
    }

    //factorial
    public double fac(int a) {
        while (a == 1) {
            return 1;
        } else {
            return a * fac(a-1);
        }
    }

    /*============= Memory Function ================*/
    //Constructor to initilize memory
    public void Operations() {
        this.memory = 0;
    }

    //Clear 
    public void clear() {
        this.memory = 0;
    }

    //Recall memory (AKA: ANS)
    public double memoryRecall() {
        reurn this.memory;
    } 
}