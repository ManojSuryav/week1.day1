package Week1.Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input dec
		int num=44;
		
		//dec boolean variable flag as false
		boolean flag=false;
				
				//iterate from 2 - 1/2 of input
				for(int i=2;i<=num/2;i++)
				{
					// divide the i/p with loop varable && check the remainder
					int remaider=num/i;
					
					//set the flag true if there is no remainder
					if(remaider%i==0)
					{
						flag=true;
						
						//	break the instrustor
						break;
					}
				}
				//	check the flag (provide a condn)
				if(flag==false)
				{
					// print prime wen condn match
					System.out.println("it's a Prime");
				}
				else
				{
					System.out.println("Not a Prime");
				}
				
	}

}
