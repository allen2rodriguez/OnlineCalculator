public class Function {
    
    //add
    public static add(double a, double b) {
        return a + b;
    }

    //subtraact 
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
}
