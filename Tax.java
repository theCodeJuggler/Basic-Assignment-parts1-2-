//Wprogram6
//Calculating tax according to tax slab
import java.io.*;
class Tax
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Acepting the salry from the user
		System.out.print("Enter The CTC : ");	double ctc = Double.parseDouble(in.readLine());
		
		//calculating tax with respect to the slab for tax and displaying the corresponding tax amount
		if(ctc<=0)
			System.out.print("Invalid Input");
		else if(ctc<=180000)
			System.out.println("Tax amount = Re. 0");
		else if(ctc>=180001 && ctc<=300000)
			System.out.println("Tax amount = Rs. "+(ctc*10/100));
		else if(ctc>=300001 && ctc<=500000)
			System.out.println("Tax amount = Rs. "+(ctc*20/100));
		else if(ctc>=500001 && ctc<=1000000)
			System.out.println("Tax amount = Rs. "+(ctc*30/100));
	}
}
