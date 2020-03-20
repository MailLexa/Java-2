package LLL;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];


    public static void main(String[] args) {
	    Main ClassMain = new Main();
	    ClassMain.one();
	    ClassMain.methodTwoo();

    }
    private  void one(){
       mass();
        long a = System.currentTimeMillis();
        for (Integer i=0; i<arr.length;i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("1 Задание :" + (System.currentTimeMillis()-a));

    }
    private void mass (){
        for (Integer i=0; i<arr.length;i++){
            arr[i] = 1f;
        }
    }
    private void methodTwoo(){
        float[] a = new float[h];
        float[] b = new float[h];
        float arr1[] = new float[size/2];
        float arr2[] = new float[size/2];
        mass();
        long n = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0,size/2-1);
        System.arraycopy(arr, size/2,  arr2,0, size - size/2);
        System.out.println("Разбивка массива: " + (System.currentTimeMillis()-n));
        MyThread potok1 = new MyThread("a",arr1);
        MyThread potok2 = new MyThread("b", arr2);

        potok1.start();
        potok2.start();

        try {
            potok1.join();
            potok2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        n = System.currentTimeMillis();
        a = potok1.getArr();
        b = potok2.getArr();

        System.arraycopy(a, 0, arr, 0, h);
        System.arraycopy(b, 0, arr, a.length, b.length);
        System.out.println("Склейка массива : " + (System.currentTimeMillis()-n));// время выполнения
        






    }
}
