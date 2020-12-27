package swap;

public class swapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 6;
		int num2 = 5;
		swapToValues(6, 5);
	}

	private static void swapToValues(int num1, int num2) {
		// TODO Auto-generated method stub

		System.out.println("before swicth num1 : " + num1 + " num2 : " + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("before swicth num1 : " + num1 + " num2 : " + num2);

	}

}
