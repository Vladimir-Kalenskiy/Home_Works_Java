// Вывести все простые числа от 1 до 1000.
package HW1;

public class Task2 {
    public static void main(String[] args) {
        int num = 1000;

        for(int i = 2; i < num; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            System.out.print(i + " ");
        }
    }
}
