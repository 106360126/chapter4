package ch4;

public class test_p26
{
	public static void main(String[] args)
	{
		Car[] cars;
		cars = new Car[2];
		cars[0]=new Car();
		cars[1]=new RacingCar();
		for(int i=0;i<cars.length;i++)
		{
			Class cl=cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		
		}
		//		RacingCar rccar1=new RacingCar();
//		rccar1.setCar(1234,20.5);
//		rccar1.setCourse(5);
//		
//		rccar1.show();

	}
	
}
class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
		
	}
	public String toString()
	{
		String str="�����O"+num+"�T�o�q�]��"+gas;
		return str;
	}
}
class RacingCar extends Car
{
	private int course;
	public RacingCar()
	{
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c)
	{
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ����s���O"+course);
	}
}

