import java.util.Scanner;
class NewsPaper
{
static int paper_rate_mon_to_fri = 5;
static int paper_rate_sat=6;
static int paper_rate_sun=7;
static int service_charge =30;
public static void main(String [] args)
{

NewsPaper bill = new NewsPaper();
bill.monthly_amt();
}
void monthly_amt()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Month Number");
//System.out.println("")
int Month_no=sc.nextInt();
if(Month_no==1||Month_no==3||Month_no==5||Month_no==7||Month_no==8||Month_no==10||Month_no==12)
{
System.out.println("Enter Starting Day of Month");
System.out.println("1 for Monday "+"\n"+"2 for Tuesday"+"\n"+"3 for Wednesday"+"\n"+"4 for Thursday"+"\n"+"5 for Friday"+"\n"+"6 for Saturday"+"\n"+"7 for Sunday");
int starting_Day = sc.nextInt();
if(starting_Day == 1 ||starting_Day == 2 ||starting_Day == 3)
{
int total_amt=((23*paper_rate_mon_to_fri)+(4*paper_rate_sat)+(4*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
if(starting_Day == 4)
{
int total_amt=((22*paper_rate_mon_to_fri)+(5*paper_rate_sat)+(4*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
if(starting_Day == 5 ||starting_Day == 6)
{
int total_amt=((21*paper_rate_mon_to_fri)+(5*paper_rate_sat)+(5*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
if(starting_Day == 7)
{
int total_amt=((22*paper_rate_mon_to_fri)+(4*paper_rate_sat)+(5*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
}
else if(Month_no ==4 ||Month_no == 6 || Month_no ==9 ||Month_no == 11)
{
System.out.println("Enter Starting Day of Month");
System.out.println("1 for Monday "+"\n"+"2 for Tuesday"+"\n"+"3 for Wednesday"+"\n"+"4 for Thursday"+"\n"+"5 for Friday"+"\n"+"6 for Saturday"+"\n"+"7 for Sunday");
int starting_Day = sc.nextInt();
if(starting_Day == 1 ||starting_Day ==  2 ||starting_Day ==  3 ||starting_Day ==  4)
{
int total_amt=((22*paper_rate_mon_to_fri)+(4*paper_rate_sat)+(4*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
if(starting_Day == 5)
{
int total_amt=((21*paper_rate_mon_to_fri)+(5*paper_rate_sat)+(4*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
if(starting_Day == 6)
{
int total_amt=((20*paper_rate_mon_to_fri)+(5*paper_rate_sat)+(5*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}

if(starting_Day == 7)
{
int total_amt=((21*paper_rate_mon_to_fri)+(4*paper_rate_sat)+(5*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
}
if(Month_no==2)
{
int total_amt=((20*paper_rate_mon_to_fri)+(4*paper_rate_sat)+(4*paper_rate_sun)+service_charge);
System.out.println("The Total Amount for the Month"+"="+total_amt);
}
}

}
