package HW6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class main {
    public static void main(String[] args) throws Exception {

       Notebook nb1 = new Notebook("MSI Dragon II", "Black", "Windows11", 16, 1000);
       Notebook nb2 = new Notebook("Lenovo IdeaPad", "Silver", "Windows10", 4, 320);
       Notebook nb3 = new Notebook("MacBook Air", "Space Grey", "macOS", 8, 256);
       Notebook nb4 = new Notebook("Dell Inspirion", "Black", "Windows8", 8, 512);
       Notebook nb5 = new Notebook("Prestigio", "White", "Windows10", 2, 256);
       Notebook nb6 = new Notebook("Alienware m15", "Black", "Windows11", 32, 1000);

       Set<Notebook> Laptop = new HashSet<>();
       Laptop.add(nb1);
       Laptop.add(nb2);
       Laptop.add(nb3);
       Laptop.add(nb4);
       Laptop.add(nb5);
       Laptop.add(nb6);

    //    Map<Integer, String> mapSpecific = new HashMap<>();
    //     mapSpecific.put(1, "объем оперативной памяти");
    //     mapSpecific.put(2, "объем накопителя");
    //     mapSpecific.put(3, "ОС");
    //     mapSpecific.put(4, "цвет");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужные характеристики: \nОбъем оперативной памяти: ");
        int userRam = sc.nextInt();
        System.out.println("Объем жесткого диска: ");
        int userRom = sc.nextInt();
        System.out.println("Операционная система(Windows11, Windows10, Windows8, macOS): ");
        String userOs = sc.next().toString();

        System.out.println();

        for (Notebook userNotebook : Laptop) {
            if((userNotebook.getRam() >= userRam) && (userNotebook.getRom() >= userRom) && (userNotebook.getOs().equals(userOs))) {
                System.out.println(userNotebook.toString());
            }
            else {
                System.out.println(userNotebook);
            }
        }
        sc.close();
    }
}
