/**
 * MontyHallNoMonty Class
 * Simulates the Monty Hall problem, but it removes the host
 * @author Nic Manoogian
 */
public class MontyHallNoMonty
{
    /**
     * Simulates one selection
     * The door with the car and user selection is chosen at random
     * @return 1 if the user chose the car, 0 if the user should have switched
     */
    public static int draw()
    {
        int userSelection = ((int)(Math.random()*3)) + 1;
        int doorWithCar = ((int)(Math.random()*3)) + 1;
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

    /**
     * Main Method
     * Draws a number of times and keeps track of the number of successes
     * @param args first argument is the number of iterations
     */
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
