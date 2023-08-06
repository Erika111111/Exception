package HW2;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        inputFloatNumber();
    }

private static void inputFloatNumber(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите дробное число: ");
    String st = sc.next();
    
    try {
        Float.parseFloat(st);
        System.out.println(" Все верно!");
    } 
    catch (Exception e) {
       System.out.println("Вы ввели не число! Введите число");
    }
    
}
}



