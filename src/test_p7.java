public class test_p7 
{
	public static void main(String[] args) 
	{
		Car7 car1;
		car1 = new Car7();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Car7 car2;
		car2 = new Car7();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);
		
		System.out.println("car2車號是"+car2.num);
		System.out.println("car2汽油量是"+car2.gas);
	}

}
class Car7
{
	int num;
	double gas;
}