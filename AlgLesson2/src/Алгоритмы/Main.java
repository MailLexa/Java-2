package Алгоритмы;

import java.util.Random;

public class Main {
    int[] mas;
    int[] masA;

    public static void main(String[] args) {
        Main One = new Main ();
        One.createMassiv(100000);
        One.addMassiv(1);
        One.deleteMassiv(3);
        One.findMassiv(1);
        One.randomMassiv();
        System.out.println("Точка");
        System.arraycopy(One.mas,0,One.masA,0,One.mas.length);
       // One.printMassiv();
        System.out.println("Точка");
        long startTime = System.currentTimeMillis();
        One.puzSortMassiv();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nПузырьковая сортировка выполнялась " + timeSpent + " миллисекунд");
       // One.printMassiv();
        System.out.println("Точка");
        System.arraycopy(One.masA,0,One.mas,0,One.masA.length);
        //One.printMassiv();
        startTime = System.currentTimeMillis();
        One.markerSortMassiv();
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nСортировка методом выбора выполнялась " + timeSpent + " миллисекунд");
        //One.printMassiv();
        System.arraycopy(One.masA,0,One.mas,0,One.masA.length);
        //One.printMassiv();
        System.out.println("Точка");
        startTime = System.currentTimeMillis();
        One.pasteSortMassiv();
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nСортировка методом вставки " + timeSpent + " миллисекунд");
       // One.printMassiv();

    }
    public void createMassiv (int a){
        mas = new int [a];
        masA = new int[a];
        System.out.println(mas.length);
    }

    public void addMassiv (int a){
        for (int b=0; b<mas.length;b++){
            if (mas[b] == 0) {
                mas[b] = a;
                System.out.println("Значение добавлено в массив");
                break;
            }
        }
    }

    public void deleteMassiv (int a){
        if (a!=0){
            for (int b=0; b<mas.length; b++) {
                if (mas[b] == a) {
                    mas[b] = 0;
                    System.out.println("Удалено" + " a" + " индекс " + b);
                }
            }
        }
    }

    public void findMassiv (int a){
        if (a!=0){
            for (int b=0; b<mas.length; b++) {
                 if (mas[b] == a)
                      System.out.println("Найдено число"+" a"+" индекс "+b);
             }
        }
    }

    public void randomMassiv(){
        Random random = new Random();
        for(int b=0; b<mas.length;b++){
            mas[b]=random.nextInt(100);
        }
    }

    public void puzSortMassiv(){
        int c;
        for(int a=0; a<mas.length;a++){
            for(int b=1; b<mas.length;b++){
                if (mas[b-1]>mas[b]){
                    c = mas[b];
                    mas[b] = mas[b-1];
                    mas[b-1] = c;



                }
            }
        }
    }
    public void markerSortMassiv(){
        int c;
        for(int a = 0; a<mas.length;a++){
            for(int b=0; b<mas.length;b++){
                if(mas[a]<mas[b]){
                    c=mas[a];
                    mas[a]=mas[b];
                    mas[b]=c;
                }

            }

        }
    }

    public void pasteSortMassiv(){
        int c;
        for (int a=0;a<mas.length;a++){
            for (int b=1;b<mas.length;b++){
                if (mas[b-1]>mas[b]){
                    c=mas[b-1];
                    mas[b-1]=mas[b];
                    mas[b]=c;

                }
            }
        }
    }
    public void printMassiv(){
        System.out.println();
        for (int a=0; a<mas.length;a++) {
            System.out.print(mas[a]+" ");
        }
    }
}
