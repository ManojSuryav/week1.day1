package Week1.Day1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input declare
		int num=666;
		//declr 3 more
		int calculated=0;
		int remainder;
		int original;
		//Assign i/p into variable orignal
		System.out.println("ip - "+num);
		original=num;
		//use loop to calculate:use while loop to set condn until the num is > 0
		while (num>0) {
			//get the remainder done when divided by 10
			remainder=num%10;
			num=num/10;
			//use formula
			calculated=calculated+((remainder)*(remainder)*(remainder));
			System.out.println(calculated);
		}
			//check wheather cal & orgil r same
		if(calculated==original)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}
	}

}
