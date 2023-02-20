// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

package HW2;

import java.util.logging.*;


public class Task1 {
    public static void main(String[] args) {
        
        int[] array = new int [] {1,2,3,4,5,6,7};
        // Bubble(array);
        try{
        Logger log = Logger.getLogger(Task1.class.getName());
        log.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for(int i = 1; i < array.length; i++){
            int temp ;
            temp = array[i-1];
            array[i-1] = array[i];
            array[i] = temp;
            log.info("The cycle is completed.");
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
}
}
