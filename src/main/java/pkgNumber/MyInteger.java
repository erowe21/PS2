package pkgNumber;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public Boolean isEven()
	{
		if (iValue % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Boolean isOdd()
	{
		if (iValue % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Boolean isPrime()
	{
		if (iValue < 2)
		{
			return false;
		}
		else if (iValue == 2)
		{
			return true;
		}
		if (iValue % 2 == 0)
		{
			return false;
		}
		else
		{	
			for (int i = 3; i * i <= iValue+1; i += 2)
			if (iValue % i ==0) return false;
		return true;
		}
	}
	public static boolean isEven(int x)
	{
		if(x % 2 == 0)
			{
			return true;
			}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(int x)
	{
		if(x % 2 == 1)
			{
			return true;
			}
		else
		{
			return false;
		}
	}
	public static Boolean isPrime(int x)
	{
		if (x < 2)
		{
			return false;
		}
		else if (x == 2)
		{
			return true;
		}
		if (x % 2 == 0)
		{
			return false;
		}
		else
		{	
			for (int i = 3; i * i <= x+1; i += 2)
			if (x % i ==0) return false;
		return true;
		}
	}
	public static boolean isEven(MyInteger iValue)
	{
		if (isEven(iValue) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}
	public static boolean isOdd(MyInteger iValue)
	{
		if(isOdd(iValue) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(MyInteger iValue)
	{
		if(isPrime(iValue) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	
}
	

