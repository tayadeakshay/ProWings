import java.util.Scanner;

public class IsValidAmount {

	public static void main(String[] args) {
		int count = 0;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn");
		do {
			int amount = sc.nextInt();

			boolean valid = validAmount(amount);
			if (valid) {
				System.out.println("Your transaction is being processed");
				count++;
			} else {
				System.out.println("Please enter amount in multiples of 100");
				temp++;
			}
		} while (count == 0 && temp <= 2);
		if (temp >= 3)
			System.out.println("Transaction time out");
	}

	public static boolean validAmount(int amount) {
		boolean res1=maxAmount(amount);
		boolean res;
		if(res1) {
		if (amount == 0)
			res = false;
		else if (amount % 100 == 0)
			res = true;
		else
			res = false;
		}
		else
		{System.out.println("Maximum amount limit is 25000");
			res =false;
			}
		return res;
	}

	public static boolean maxAmount(int a) {
		boolean res1;
		if (a > 25000) {
			res1 = false;
		}
		else
			res1 = true;
		return res1;
	}
}
