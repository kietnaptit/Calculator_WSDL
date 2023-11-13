package calculators;

import control.CalculatorControl;
import java.util.Scanner;
import model.Calculator;
import view.CalculatorView;


public class Calculators {


    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int t = Integer.parseInt(cin.nextLine());
//        while(t-->0){
//            String s = cin.nextLine();
//            String st[] = s.trim().split("\\s+");
//            Double num1 = Double.parseDouble(st[0]);
//            String operator = st[1];
//            Double num2 = Double.parseDouble(st[2]);
//            Calculator cal = new Calculator(num1, num2);
//            CalculatorControl cc = new CalculatorControl();
//            if(operator.equals("+")){
//                System.out.println("Result of " + cal.getFirstNumber() + " + " + cal.getSecondNumber() + " = " + cc.add(cal));
//            }else if(operator.equals("-")){
//                System.out.println("Result of " + cal.getFirstNumber() + " - " + cal.getSecondNumber() + " = " + cc.sub(cal));
//            }else if(operator.equals("*")){
//                System.out.println("Result of " + cal.getFirstNumber() + " * " + cal.getSecondNumber() + " = " + cc.multiple(cal));
//            }else if(operator.equals("/")){
//                System.out.println("Result of " + cal.getFirstNumber() + " / " + cal.getSecondNumber() + " = " + cc.div(cal));
//            }
//        }
        CalculatorView view = new CalculatorView();
        view.setVisible(true);
    }
    
}
