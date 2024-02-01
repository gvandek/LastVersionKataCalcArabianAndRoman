import java.util.Scanner;

public class Katacalc {
    public static void main(String[] args) {

        String[] splitoper = {"\\+", "-", "/", "\\*"};
        String[] oper = {"+", "-", "/", "*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String exp = scn.nextLine();
        /*int a = -1;
        for (int i = 0; i < oper.length; i++) {
            if(exp.contains(oper[i])){
                a = i;
                break;
            }
        }*/
        String action = null;
        String[] proverka = null;

        if(exp.contains("+")) {
            proverka = exp.split("\\+");
            action = "+";
        }
        else if(exp.contains("-")) {
            proverka = exp.split("-");
            action = "-";
        }else if(exp.contains("*")) {
            proverka = exp.split("\\*");
            action = "*";
        }else if (exp.contains("/")) {
            proverka = exp.split("/");
            action = "/";
        }
        for (int d = 0; d < proverka.length; d++) {
        }

        if(action.equals("+")) {
            System.out.println(Integer.parseInt(proverka[0]) + Integer.parseInt(proverka[1]));
        } else if(action.equals("-")) {
            System.out.println(Integer.parseInt(proverka[0]) - Integer.parseInt(proverka[1]));
        }else if(action.equals("*")) {
            System.out.println(Integer.parseInt(proverka[0]) * Integer.parseInt(proverka[1]));
        }else if (action.equals("/")) {
            System.out.println(Integer.parseInt(proverka[0]) / Integer.parseInt(proverka[1]));
        }

    }
    }
