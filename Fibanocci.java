package Week1.Day1;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//initialize 3 var
		int range=8;
		int firstNum=0;
		int secNum=1;
		
		System.out.println("input Range = "+range);
		
		//print 1st Num
		System.out.println(firstNum);
		
		//print 2nd Num
		System.out.println(secNum);
		
		//iterate from 1 to the range
		for(int i=1;i<(range-1);i++)
		{
			//add 1st & 2nd Num Assign to the sum
			int sum=firstNum+secNum;
			
			//assign 2nd num to the 1st Num
			firstNum=secNum;
			
			//assign sum to 2nd num
			secNum=sum;
			
			//print sum
			System.out.println(sum);			
		}
	}

}
