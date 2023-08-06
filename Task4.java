//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        ExceptStr();
    }
private static void ExceptStr(){
    System.out.println("Введите строку: ");
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    try{
        if(n.isEmpty()){
            throw new IllegalArgumentException(" Пустую строку вводить нельзя");
        }
    }catch(IllegalArgumentException e){
        System.out.println("Введена пустая строка. Попробуйте снова ");
    }
    
}

}
