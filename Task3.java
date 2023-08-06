

public class Task3 {
    public static void main(String[] args) {
        printSum(5,0);
    }
    
 public static void printSum(Integer a, Integer b) {
System.out.println(a + b);
try {
        a = 90;
        b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (ArithmeticException e) {
       System.out.println("Делить на 0 нельзя");
   } catch (NullPointerException e) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException e) {
       System.out.println("Массив выходит за пределы своего размера!");
   }

}
    
}
  




