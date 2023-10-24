package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        double result = 1;
        if (power >=0)for (int i = 1; i <= power; i++)result *= numberToPrint;
        else for (int i = 1; i <= power*-1; i++) result /= numberToPrint;
        System.out.println((int)result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
