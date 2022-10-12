import java.util.Scanner;
class Electricity_Bill
{
int subsidy=150;
public static void main(String [] args)
{
Electricity_Bill a = new Electricity_Bill();
System.out.println("For year 2021");
double amt_2021 = a.bill_2021();
System.out.println("Electricity bill in year 2021"+"="+amt_2021);
System.out.println("For year 2022");
double amt_2022 = a.bill_2022();
System.out.println("Electricity bill in year 2022"+"="+amt_2022);
System.out.println();
System.out.println("Amount difference between 2021 & 2022"+" "+"="+(amt_2022-amt_2021));
System.out.println("Averge EB bill increased from 2021 to 2022"+" "+"="+(amt_2022/6-amt_2021/6));
System.out.println("Enter Monthly Units Consumed");
double amt_2022_monthly = a.monthly_bill_2022();
System.out.println("Electricity bill in year 2022 if we paid monthly"+"="+amt_2022_monthly);
System.out.println("Difference in amount if we paid monthly once and monthly twice"+"="+(amt_2022-amt_2022_monthly));
}

double bill_2021()
{
int no1=1,no2=2;
double total_amt_2021=0;
double [] amt = new double[6];
for(int i=0;i<6;i++)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amount of Units Consumed in Month"+" "+no1+"&"+no2);
int units = sc.nextInt();
if(units<=100)
amt[i]=0;
if(units<=200&&units>100)
amt[i]=(units*1.50)-subsidy+20;
if(units<=500&&units>200)
amt[i]=350+((units-200)*3)-subsidy+30;
if(units>500)
amt[i]=1880+((units-500)*6.60)-subsidy+50;
System.out.println("Amount for month"+" "+no1+"&"+no2+" "+amt[i]);
 total_amt_2021=total_amt_2021+amt[i];
 no1=no1+2;
 no2=no2+2;
}
return total_amt_2021;
}

double bill_2022()
{
int no1=1,no2=2;
double total_amt_2022=0;
double [] amt = new double[6];
for(int i=0;i<6;i++)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amount of Units Consumed in Month"+" "+no1+"&"+no2);
int units = sc.nextInt();
if(units<=100)
amt[i]=0;
if(units<=200&&units>100)
amt[i]=150+((units-100)*2.25)-subsidy;
if(units<=400&&units>200)
amt[i]=375+((units-200)*4.50)-subsidy;
if(units<=500&&units>400)
amt[i]=1275+((units-400)*6)-subsidy;
if(units>500)
{
 if((units-500)<=100)
amt[i]=2100+((units-500)*8)-subsidy;
 if((units-500)<=300&&(units-500)>100)
amt[i]=2900+((units-600)*9)-subsidy;
 if((units-500)<=500&&(units-500)>300)
amt[i]=4700+((units-800)*10)-subsidy;
 if(units>1000)
amt[i]=6700+((units-1000)*11)-subsidy;
}
System.out.println("Amount for month"+" "+no1+"&"+no2+" "+amt[i]);
 total_amt_2022=total_amt_2022+amt[i];
 no1=no1+2;
 no2=no2+2;
}
return total_amt_2022;
}

double monthly_bill_2022()
{
int no1=1;
double total_amt_2022=0;
double [] amt = new double[12];
for(int i=0;i<12;i++)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amount of Units Consumed in Month"+" "+no1);
int units = sc.nextInt();
if(units<=100)
amt[i]=0;
if(units<=200&&units>100)
amt[i]=150+((units-100)*2.25)-subsidy;
if(units<=400&&units>200)
amt[i]=375+((units-200)*4.50)-subsidy;
if(units<=500&&units>400)
amt[i]=1275+((units-400)*6)-subsidy;
if(units>500)
{
 if((units-500)<=100)
amt[i]=2100+((units-500)*8)-subsidy;
 if((units-500)<=300&&(units-500)>100)
amt[i]=2900+((units-600)*9)-subsidy;
 if((units-500)<=500&&(units-500)>300)
amt[i]=4700+((units-800)*10)-subsidy;
 if(units>1000)
amt[i]=6700+((units-1000)*11)-subsidy;
}
System.out.println("Amount for month"+" "+no1+" "+"="+amt[i]);
 total_amt_2022=total_amt_2022+amt[i];
 no1=no1+1;
}
return total_amt_2022;
}
}
