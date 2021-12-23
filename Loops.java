import java.util.Scanner;

public class Loops {
    
        float phy, chem, maths, total, avg;

        void total(){
            total = phy + maths + chem;
        }
        void avg(){
            avg = total/3;
        }
        void result(){
            if((phy < 35) || (chem < 35) || (maths <35)){
                System.out.println("You are Fail \n You don't have more than 35 marks in all subject");
            }
            else if(avg <40){

                System.out.println("You are Fail \n Your average is less than 40%");
            }
            else{
                System.out.println("Congrats!\n You are Pass");
            }
        }
        void grade(){
            if (avg > 90 && avg <= 100) {
                System.out.println("Your Grade is A+");
            } else if (avg > 80 && avg <= 90) {
                System.out.println("Your Grade is A");
            } else if (avg > 70 && avg <= 80) {
                System.out.println("Your Grade is B");
            } else if (avg > 60 && avg <= 70) {
                System.out.println("Your Grade is C");
            } else if (avg > 50 && avg <= 60) {
                System.out.println("Your Grade is D");
            } else if (avg > 40 && avg <= 50) {
                System.out.println("Your Grade is E");
            }
        }
    public static void main(String[] args) {

        System.out.println("enter your Physics marks");
        Scanner p = new Scanner(System.in);
        Loops l = new Loops();
        l.phy = p.nextFloat();
        
        System.out.println("enter your Maths marks");
        Scanner m = new Scanner(System.in);
        l.maths = m.nextFloat();
        
        System.out.println("enter your Chemistry marks");
        Scanner c = new Scanner(System.in);
        l.chem = c.nextFloat();

        l.total();
        l.avg();
        l.result();
        l.grade();
        System.out.println("Total = " + l.total + "\nAvrage = " + l.avg);
    }
}
