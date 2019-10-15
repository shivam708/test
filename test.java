import java.util.Scanner;
#This is a comment for testing
class Calculator 
{
	public static void main(String[] args) 
	{
		//create instance/ object of scanner class
		Scanner ref=new Scanner(System.in);//console i/p --std i/p
		boolean exit=false;
		while(!exit)
		{
		
		System.out.println("Enter operation & 2 double values");
		String cmd=ref.next();
		double d1=ref.nextDouble();//string-->double
		double d2=ref.nextDouble();//string-->double
		switch(cmd) {
			case "add" : System.out.println("Res "+(d1+d2));
				break;
			case "sub" : System.out.println("Res "+(d1-d2));
			break;
			case "mult" : System.out.println("Res "+(d1*d2));
				break;
			case "div" : System.out.println("Res "+(d1/d2));
				break;
			case "quit" : exit=true;
			System.out.println("Terminating application...Good Bye!");
				break;
			default : System.out.println ("Invalid operation !! , Pls retry");
		}
		}
		ref.close();


	}
}

