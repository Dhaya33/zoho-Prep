import java.util.Scanner;

public class calculatingTax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter your income: ");

        double income= in.nextDouble();

        double taxamount= calculatetax(income);
        double netIncome= income-taxamount;


        System.out.println("Gross Income : " + income);

        System.out.println(" Your Tax Amount :"+taxamount);

        System.out.println("Your Net Income:"+netIncome);

    }

    public static double calculatetax(double income){


        double tax=0;
        if(income<=250000){
            return 0;
        } else if (income<=500000) {

            tax = (income - 250000)*0.05;

            }
        else if (income<=1000000) {

            tax= 250000*0.05;
            tax += (income - 500000)*0.20;
        }
        else {
            tax= 250000*0.05;
            tax+=500000*0.20;
            tax+=(income-1000000)*30;

    }
        return tax;
    }
}
