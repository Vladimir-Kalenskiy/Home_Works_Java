// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package HW2;
public class Task3 {
    public static void main(String[] args) {
        String list1 = "qwertrewq";
        String list2 = "Hello World";
        System.out.println(palindrom(list1)); 
        System.out.println(palindrom(list2));
    }
    public static Boolean palindrom(String line) {
        Boolean result = true;

        for(int i = 0; i < (line.length()/2); i++){
            if(line.charAt(i) == line.charAt(line.length() - 1 - i));
            else return result = false;
        }
        return result;
    }
}
