package ch4;

public class test_p38
{
	public static void main(String[] args)
	{
		iVehicle[] ivc = new iVehicle[2];
		ivc[0]=new Car(1234,20.5);
		
		
		ivc[1]=new Plane(232);
		
		
//		Car[] cars;
//		cars = new Car[2];
//		cars[0]=new Car();
//		cars[1]=new RacingCar();
		for(int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
		//		RacingCar rccar1=new RacingCar();
//		rccar1.setCar(1234,20.5);
//		rccar1.setCourse(5);
//		
//		rccar1.show();

	}
	
}
interface iVehicle
{
	int weight =1000;
	 void show(); 
}
class Car implements iVehicle
{
	protected int num;
	protected double gas;
	
//	public Car()
//	{
//		num=0;
//		gas=0.0;
//		System.out.println("生產了車子");
//	}
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
		
	}
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
//		System.out.println("賽車的編號是"+speed);
	}
}
class Plane implements iVehicle
{
	private int flight;
	public Plane(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
//		System.out.println("速度是"+speed);
	}
}

