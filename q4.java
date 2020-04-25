package jp;

import java.util.Calendar;
import java.util.Scanner;

public class q4 {
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] date = s.split("/");
		System.out.println("aa");


		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt((date[0])) , Integer.parseInt(date[1]) - 1 , 1);

		int pos = 0;

		switch(cal.get(Calendar.DAY_OF_WEEK))
		{

			case Calendar.SUNDAY:
				pos = 0;
				break;
			case Calendar.MONDAY:
				pos = 1;
				break;
			case Calendar.TUESDAY:
				pos = 2;
				break;
			case Calendar.WEDNESDAY:
				pos = 3;
				break;
			case Calendar.THURSDAY:
				pos = 4;
				break;
			case Calendar.FRIDAY:
				pos = 5;
				break;
			case Calendar.SATURDAY:
				pos = 6;
				break;
		}
		System.out.println(s);
		int k = 1;
		String st = "";
		for(int l = 1 ; l < pos+1 ; l++)
		{
			st = st.concat("  ");
		}
		for (int i = 0 ; i < 5 ; i++)
		{
			for (int j = pos ; j < 7 ; j++)
			{

				if(k <= 9)
				{
					st = " " + k ;
				}
				else {
					st = String.valueOf(k);
				}
				System.out.print(st);
				k++;
				if(k > cal.getActualMaximum(Calendar.DAY_OF_MONTH))
				{
					break;
				}
			}
			pos = 0;
			System.out.println();



		}

	}
}
