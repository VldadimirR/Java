package Homework_6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptops laptops1 = new Laptops();
        laptops1.setModel("Lenovo");
        laptops1.setRam(8);
        laptops1.setHardDiskCapacity(512);
        laptops1.setOperationSystem("Windows");
        laptops1.setColor("silver");
        laptops1.setDisplayDiagonal(15.6);

        Laptops laptops2 = new Laptops();
        laptops2.setModel("Lenovo");
        laptops2.setRam(4);
        laptops2.setHardDiskCapacity(1024);
        laptops2.setOperationSystem("Windows");
        laptops2.setColor("silver");
        laptops2.setDisplayDiagonal(15.8);

        Laptops laptops3 = new Laptops();
        laptops3.setModel("Asus");
        laptops3.setRam(8);
        laptops3.setHardDiskCapacity(256);
        laptops3.setOperationSystem("Linux");
        laptops3.setColor("black");
        laptops3.setDisplayDiagonal(14);

        Laptops laptops4 = new Laptops();
        laptops4.setModel("Huawei");
        laptops4.setRam(16);
        laptops4.setHardDiskCapacity(512);
        laptops4.setOperationSystem("Windows");
        laptops4.setColor("black");
        laptops4.setDisplayDiagonal(15.6);

        Laptops laptops5 = new Laptops();
        laptops5.setModel("Asus");
        laptops5.setRam(4);
        laptops5.setHardDiskCapacity(256);
        laptops5.setOperationSystem("Linux");
        laptops5.setColor("gold");
        laptops5.setDisplayDiagonal(14);

        Set<Laptops> laptopsSet = new HashSet<>();
        laptopsSet.add(laptops1);
        laptopsSet.add(laptops2);
        laptopsSet.add(laptops3);
        laptopsSet.add(laptops4);
        laptopsSet.add(laptops5);

        filter(laptopsSet);
    }

    public static void filter(Set<Laptops> laptopsSet) {
        System.out.println("Введите цифры, соответствующие необходимому критерию, через пробел: \n" +
                "1 - Модель\n" +
                "2 - Объем оперативной памяти\n" +
                "3 - Объем жесткого диска\n" +
                "4 - Операционная система\n" +
                "5 - Цвет\n" +
                "6 - Диагональ\n");
        int check1 = 0, check2 = 0, check3 = 0, check4 = 0, check5 = 0;
        double check6 = 0;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        ArrayList<String> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == 1) {
                System.out.println("Введите желаемую модель: \n" +
                                    "1 - Lenovo \n" +
                                    "2 - Asus \n" +
                                    "3 - Huawei");
                String b = scanner.nextLine();
                lst.add(b);
            }
            if (Integer.parseInt(arr[i]) == 2) {
                System.out.println("Введите объем оперативной памяти");
                String c = scanner.nextLine();
                lst.add(c);
            }
            if (Integer.parseInt(arr[i]) == 3) {
                System.out.println("Введите объем жесткого диска");
                String d = scanner.nextLine();
                lst.add(d);
            }
            if (Integer.parseInt(arr[i]) == 4) {
                System.out.println("Введите желаемую операционную систему: \n" +
                                "1 - Windows \n" +
                                "2 - Linux \n");
                String e = scanner.nextLine();
                lst.add(e);
            }
            if (Integer.parseInt(arr[i]) == 5) {
                System.out.println("Введите желаемый цвет: \n" +
                                    "1 - silver \n" +
                                    "2 - black \n" +
                                    "3 - gold");
                String f = scanner.nextLine();
                lst.add(f);
            }
            if (Integer.parseInt(arr[i]) == 6) {
                System.out.println("Введите диагональ");
                String g = scanner.nextLine();
                lst.add(g);
            }
        }
        TreeMap<Integer, Integer> filter1 = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            filter1.put(Integer.parseInt(arr[i]), Integer.parseInt(lst.get(i)));
        }
        System.out.println(filter1);

        
        Set<Laptops> result = new HashSet<>();
        if (filter1.get(1) != null){
            check1 = filter1.get(1);
        }
        if (filter1.get(2) != null){
            check2 = filter1.get(2);
        }
        if (filter1.get(3) != null){
            check3 = filter1.get(3);
        }
        if (filter1.get(4) != null){
            check4 = filter1.get(4);
        }
        if (filter1.get(5) != null){
            check5 = filter1.get(5);
        }
        if (filter1.get(6) != null){
            check6 = (double)filter1.get(6);
        }
        
        for(Laptops i: laptopsSet){
            if ((i.getModel() == check1 || check1==0)  &&  i.getRam() >= check2 && i.getHardDiskCapacity() >= check3 && 
            (i.getOperationSystem() == check4 || check4 == 0) && (i.getColor() == check5 || check5 == 0) && i.getDisplayDiagonal() >= check6){
                result.add(i);
            }
        }
        for (Laptops i : result) {
            System.out.println(i);
        }
    }
}

