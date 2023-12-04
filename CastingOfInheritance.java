class Bank{
double getRateOfInterest(){
return 0.0;
}
}
class Sbi extends Bank{
      double sbiLoan;
double getRateOfInterest(){
return sbiLoan;
}
void setRateOfInterest(double sbiLoan){
this.sbiLoan=sbiLoan;

}
}
class Icici extends Bank{
    double icicilLoan;
double getRateOfInterest(){
return icicilLoan;
}
void setRateOfInterest(double icicilLoan){
this.icicilLoan=icicilLoan;
}
}
class Axis extends Bank{
     double axisLoan;
double getRateOfInterest(){
return  axisLoan;
}
void setRateOfInterest(double axisLoan){
this.axisLoan=axisLoan;
}
}
public class CastingOfInheritance {
    public static void main(String args[]) {
        Sbi one=new Sbi();
        one.setRateOfInterest(10000);
          Icici two=new Icici();
        two.setRateOfInterest(5000);
         Axis three=new Axis();
        three.setRateOfInterest(2000);
        System.out.println("SBI:"+"Rate Of Interest:8.4"+" "+"Loan:"+one.getRateOfInterest()+" "+"Interest"+" "+one.getRateOfInterest()*8.4*1+"%");
        System.out.println("ICICI:"+"Rate Of Interest:7.3"+" "+"Loan:"+two.getRateOfInterest()+" "+"Interest"+" "+two.getRateOfInterest()*7.3*1+"%");
        System.out.println("AXIS:"+"Rate Of Interest:9.7"+" "+"Loan:"+three.getRateOfInterest()+" "+"Interest"+" "+three.getRateOfInterest()*9.7*1+"%");
    }
}
