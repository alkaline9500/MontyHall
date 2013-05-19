public class MontyHallNoMonty
{
    public static int draw()
    {
        int userSelection = ((int)(Math.random()*3)) + 1; //1
        int doorWithCar = ((int)(Math.random()*3)) + 1; //1
        System.out.println("You pick " + userSelection + ". Car is in " + doorWithCar);
        if (userSelection == doorWithCar)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        int sum = 0;
        int RUNS = Integer.parseInt(args[0]);
        for (int i = 0; i < RUNS; i++)
        {
            sum += draw();
        }
        double ratio = (double)sum / (double)RUNS;
        System.out.println("Ratio for keeping: " + ratio);
    }
}
