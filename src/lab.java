import java.util.Scanner;
public class lab {

	public static void main(String[] args) {
	
	Scanner scnr=new Scanner(System.in);
	int month;
	int day;
	int year;
	int magicNum;
	System.out.println("In numeric form, enter a month, day, then year");
	month=scnr.nextInt();
	day=scnr.nextInt();
	year=scnr.nextInt();
	magicNum=month*day;
	if(magicNum==year) {
		
		System.out.println("The date you entered is magic!");
		
	}
	else {
		System.out.println("The date entered is not magic");
	}
		
		
	}

}
