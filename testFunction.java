public class testFunction {
    public static void main(String[] args) {
        Operations newObject = new Operations();
        
        double resultAdd = newObject.add(5,3);
        double resultSub = newObject.sub(3,4);
        double resultMulti = newObject.multi(5,3);
        double resultDiv = newObject.div(55.2,3.3);

        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSub);
        System.out.println("Multiplication result: " + resultMulti);
        System.out.println("Division result: " + );
    }
}