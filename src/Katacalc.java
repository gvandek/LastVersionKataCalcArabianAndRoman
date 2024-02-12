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
         String[] numbers = exp.split("[+\\-*/]");
         if (numbers.length < 2) throw new Exception("строка не является математической операцией");
         if (numbers.length >= 3) throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
         if (numbers.length != 2) throw new Exception("Должно быть два числа");
         action = validate(exp);
         if (!Roman.isRoman(numbers[0]) && !Roman.isRoman(numbers[1])) {
             num1 = Integer.parseInt(numbers[0]);
             num2 = Integer.parseInt(numbers[1]);
             isRoman = false;
         }else if (Roman.isRoman1(numbers[0]) && Roman.isRoman1(numbers[1])) {
             num1 = Roman.romanToArabic(numbers[0]);
             num2 = Roman.romanToArabic(numbers[1]);
             isRoman = true;
         } else {
             throw new Exception("Используются одновременно разные системы счисления");
         }
         int resultArabian = calc(num1, num2, action);
         if (num1 > 10 || num2 > 10) {
             throw new Exception("Числа должны быть от 1 до 10");
         }
         if (isRoman) {
                 if (resultArabian <= 0) {
                     throw new Exception("в римской системе нет отрицательных чисел");
                 }
             String result = Integer.toString(resultArabian);
             result = Roman.convertToRoman(resultArabian);
             System.out.println(result);
         } else {
                 System.out.println(resultArabian);
             }
         }
     private static String validate(String exp) throws Exception{
         String[] proverka = null;
         String action = null;
          if (exp.contains("+"))
              return "+";
          else if (exp.contains("-"))
              return "-";
          else if (exp.contains("*"))
              return "*";
          else if (exp.contains("/"))
              return "/";
          else
              throw new Exception("Введен неправильный знак дейтсвия ");
 }
     private static int calc(int num1, int num2, String action) {
          if (action.equals("+")) {
              return num1 + num2;
          } else if (action.equals("-")) {
              return num1 - num2;
          } else if (action.equals("*")) {
              return num1 * num2;
          } else
              return num1 / num2;
          }
      }



















