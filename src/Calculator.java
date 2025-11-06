public class Calculator{
	public void add(int a, int b){
		System.out.println("Called the add function");
		System.out.println("Sum of " + a + " and " + b + " is " + a+b);
		System.out.println("Exiting the add function");

	}
	
	public void sub(int a, int b){
		System.out.println("Called the sub function");
        int diff = a-b;
		System.out.println("Subtraction of " + a + " and " + b + " is " + diff);
		System.out.println("Exiting the sub function");

	}

}