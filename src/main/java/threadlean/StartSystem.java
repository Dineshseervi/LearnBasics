package threadlean;

public class StartSystem {
    public static void main(String[] args) {
        ApplicationStartupHeathCheck applicationStartupHeathCheck=ApplicationStartupHeathCheck.getInstance();
        boolean result=applicationStartupHeathCheck.checkSystemHeath();
        System.out.println("External services validation completed !! Result was :: "+ result);
    }
}
