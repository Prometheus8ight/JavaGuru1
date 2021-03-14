package students.julija_katukova.lesson_8.level_7.task_32;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + subtraction.calculate());

		//build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		// build and calculate: 2 * 5
		Argument arg5 = new Argument(2);
		Argument arg6 = new Argument(5);
		MathOperation multiplication = new Multiplication(arg5, arg6);
		System.out.println("Multiplication result = " + multiplication.calculate());

		// build and calculate: 20 / 4
		Argument arg7 = new Argument(20);
		Argument arg8 = new Argument(4);
		MathOperation division = new Division(arg7, arg8);
		System.out.println("Division result = " + division.calculate());

		//(10 - 5) * (20 / 5)
		Argument arg9 = new Argument(10);
		Argument arg10 = new Argument(5);
		Argument arg11 = new Argument(20);
		Argument arg12 = new Argument(5);
		MathOperation subtraction1 = new Subtraction(arg9, arg10);
		MathOperation division1 = new Division(arg11, arg12);
		MathOperation multiplication1 = new Multiplication(subtraction1, division1);
		System.out.println("Final Multiplication result = " + multiplication1.calculate());
	}
}
