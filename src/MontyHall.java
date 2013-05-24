/**
 * MontyHall Class
 * The basic Monty hall simulation including all possible outcomes for selection
 * @author Nic Manoogian
 */
public class MontyHall
{
    /**
     * Simulates one selection
     * The door with the car and user selection is chosen at random
     * Monty will show the door that is not the user selection or the door with the car
     * @return 1 if the user chose the car, 0 if the user should have switched
     */
    public static int draw()
    {
        int userSelection = ((int)(Math.random()*3)) + 1;
        int doorWithCar = ((int)(Math.random()*3)) + 1;
        int montyShows = 0;
        if (doorWithCar == 1)
        {
            if (userSelection == 1)
            {
                montyShows = 2;
            }
            else if (userSelection == 2)
            {
                montyShows = 3;
            }
            else
            {
                montyShows = 2;
            }
        }
        else if (doorWithCar == 2)
        {
            if (userSelection == 1)
            {
                montyShows = 3;
            }
            else if (userSelection == 2)
            {
                montyShows = 1;
            }
            else
            {
                montyShows = 1;
            }
        }
        else
        {
            if (userSelection == 1)
            {
                montyShows = 2;
            }
            else if (userSelection == 2)
            {
                montyShows = 1;
            }
            else
            {
                montyShows = 1;
            }
        }
        System.out.println("You pick " + userSelection + ". Car is in " + doorWithCar + ". Monty shows " + montyShows + ".");
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
