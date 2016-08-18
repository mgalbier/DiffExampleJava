package DiffExample.demopackage;

public class C {
	
	float multAll(float[] numbers)
	{
		float result = 1;
		for (int i = 0; i < numbers.length; ++i)
		{
			result *= numbers[i];
		}
		return result;
	}
	
	float square(float arg)
	{
		float result = arg*arg;
		System.out.println("Square is" + result);
		return result;
	}
}
