package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = 0;
        if ((divider == 0)){
            System.out.println("division by zero");
        } else {
            result = dividend / divider;
            if ((result * dividend) != dividend){
                System.out.println("can be divided completely");
            } else if ((result * dividend) == dividend){
                System.out.println("cannot be divided completely");
            }
        }
    }
}
