import java.util.Scanner;

 public class Katacalc {
     public static void main(String[] args) throws Exception {

         String[] splitoper = {"\\+", "-", "/", "\\*"};
         Scanner scn = new Scanner(System.in);
         System.out.print("Введите выражение: ");
         String exp = scn.nextLine();
         boolean isRoman;
         int num1;
         int num2;
         String action = null;
         String[] proverka = null;
         if (exp.contains("+")) {
             proverka = exp.split("\\+");
             action = "+";
         } else if (exp.contains("-")) {
             proverka = exp.split("-");
             action = "-";
         } else if (exp.contains("*")) {
             proverka = exp.split("\\*");
             action = "*";
         } else if (exp.contains("/")) {
             proverka = exp.split("/");
             action = "/";
         } else {
             throw new Exception("Введен неправильный знак дейтсвия ");
         }
         if (proverka.length != 2) throw new Exception("Должно быть два числа");
         //нужно сделать проверку на 2 римских числа или 2 арабских

         if (Roman.isRoman(proverka[0]) && Roman.isRoman(proverka[1])) {
             num1 = Roman.romanToArabic(proverka[0]);
             num2 = Roman.romanToArabic(proverka[1]);
             isRoman = true;
             {
                 if (action.equals("+")) {
                     System.out.println(num1 + num2);
                 } else if (action.equals("-")) {
                     System.out.println(num1 - num2);
                 } else if (action.equals("*")) {
                     System.out.println(num1 * num2);
                 } else if (action.equals("/")) {
                     System.out.println(Integer.parseInt(proverka[0]) / Integer.parseInt(proverka[1]));
                 }
             }
         } else if (!Roman.isRoman(proverka[0]) && !Roman.isRoman(proverka[1])) {
             num1 = Integer.parseInt(proverka[0]);
             num2 = Integer.parseInt(proverka[1]);
             isRoman = false;
             {
                 if (action.equals("+")) {
                     System.out.println(Integer.parseInt(proverka[0]) + Integer.parseInt(proverka[1]));
                 } else if (action.equals("-")) {
                     System.out.println(Integer.parseInt(proverka[0]) - Integer.parseInt(proverka[1]));
                 } else if (action.equals("*")) {
                     System.out.println(Integer.parseInt(proverka[0]) * Integer.parseInt(proverka[1]));
                 } else if (action.equals("/")) {
                     System.out.println(Integer.parseInt(proverka[0]) / Integer.parseInt(proverka[1]));
                 }
             }
         }




     }
 }














