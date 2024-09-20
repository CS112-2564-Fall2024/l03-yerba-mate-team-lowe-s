import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);

		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0, numPasses = 0;
		String name;
		double price;

		do
		{
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();

			switch (choice) {
				case 1: // Tea
					System.out.print("Enter name      : ");
					name = keyboard.nextLine();
					keyboard.nextLine();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new Tea(name, ounces, price, brewTemp);

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;
					break;

				case 2: // YerbaMate
					System.out.print("Enter name      : ");
					name = keyboard.nextLine();
					keyboard.nextLine();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a YerbaMate, put into array
					inventory[count] = new YerbaMate(name, ounces, price, brewTemp, numPasses);

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;

					break;
			}
		}
		while (choice != 3);

		for (int i = 0; i < count; i++) {
			System.out.println(inventory[i]);
		}
		System.out.println("The average price of a beverage is: " + findAveragePrice(inventory, count));
		System.out.println("The highest price of a Yerba Mate is: " + findHighestPricedYerbaMate(inventory, count));
		
		keyboard.close();
	}

	public static double findAveragePrice(CaffeinatedBeverage[] inventory, int count) {
		double total = 0;
		double average;

		for(int i = 0; i < count; i++) {
			total += inventory[i].getPrice();
		}
		average = total / count;
		return average;
	}

	public static CaffeinatedBeverage findHighestPricedYerbaMate(CaffeinatedBeverage[] inventory, int count) {
		double max = Integer.MIN_VALUE;
		CaffeinatedBeverage highestPrice = null;

		for (int i = 0; i < count; i++) {
			if (inventory[i].getPrice() > max) {
				max = inventory[i].getPrice();
				highestPrice = inventory[i];
			}
		}
		return highestPrice;
	}
}