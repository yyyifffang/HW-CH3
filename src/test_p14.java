public class test_p14 
{
	public static void main(String[] args)
	{
		Car14 car1;
		car1 = new Car14();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}
class Car14
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
}
