import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConvertor {
    public static void main(String[] args) {

        double rupee=0, doller=0, euro=0, pound=0, code;
        DecimalFormat f = new DecimalFormat("00.000");
    
        Scanner sc = new Scanner(System.in);

        System.out.println("------> Welcome to Shakti Crrency Convertor Application -----> "+ "\n\n Enter The currency Code:-> \n 1:Rupees \n 2:Doller \n 3:Pound \n 4:Euro");
    
        code = sc.nextInt();
    
        if(code == 1)
        {
            System.out.println("Enter amount in Rupees:-> ");
            rupee = sc.nextDouble();
            doller = rupee/77.34;
            System.out.println("Doller :- " +f.format(doller));
            pound = rupee /94.46;
            System.out.println("Pound :- " +f.format(pound));
            euro = rupee /80.36;
            System.out.println("Euro :- " +f.format(euro));

        }

        else if(code == 2)
        
        {
            System.out.println("Enter amount in Doller:- ");
            euro = sc.nextDouble();
            rupee = doller * 77.34;
            System.out.println("Doller :- " +f.format(rupee));
            pound = doller * 0.82;
            System.out.println("Pound :- " +f.format(pound));
            euro = doller * 0.96;
            System.out.println("Euro :- " +f.format(euro));

        }
        else if(code == 3)
        
        {
            System.out.println("Enter amount in Pound:- ");
            euro = sc.nextDouble();
            rupee = pound * 94.43;
            System.out.println("Doller :- " +f.format(rupee));
            doller = pound * 1.22;
            System.out.println("Pound :- " +f.format(doller));
            euro = pound * 1.17;
            System.out.println("Euro :- " +f.format(euro));

        }
        else if(code == 4)
        
        {
            System.out.println("Enter amount in Euro:- ");
            euro = sc.nextDouble();
            rupee = euro * 80.43;
            System.out.println("Doller :- " +f.format(rupee));
            doller = euro * 1.04;
            System.out.println("Pound :- " +f.format(doller));
            pound = euro * 0.85;
            System.out.println("Euro :- " +f.format(pound));

        }




        else {
            System.out.println("---------> Unsupported currency conversion <-----------");

            System.out.println("---------> Thank you For using this App <-----------");
            return;
        }

    }
}

