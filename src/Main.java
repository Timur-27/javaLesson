import OOP.Woman;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Woman> mas = new ArrayList();
        mas.add(new Woman("School 11"));
        mas.add(new Woman("School 22"));
        System.out.println(mas.get(0).school);
        for(int i = 5; i<=8; i++){
            mas.add(new Woman("School" + i));
        }
      /*  for(int i=0; i<mas.size(); i++ ){
            System.out.println(mas.get(i).school);
        }*/
        for(Woman i:mas){
            System.out.println(i.school);
        }
    }


    public static void array1() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;

        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void array2() {
        int length = 5;
        int[] array = new int[length];
        int[] array2 = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 5);
            array2[i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        int sumArray = 0;
        int sumArray2 = 0;
        for (int i = 0; i < length; i++){
            sumArray += array[i];
            sumArray2 += array2[i];
            }
        sumArray = sumArray/length;
        sumArray2 = sumArray2/length;
        System.out.println(sumArray);
        System.out.println(sumArray2);
        if(sumArray<sumArray2){
            System.out.println("Значение второго больше");
        } else if (sumArray>sumArray2){
            System.out.println("Значение первого больше");
        } else {
            System.out.println("Значения равны");
        }

    }
    public static void array3(){
        int[] array = new int[15];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 9));
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.print(j);
        }

    public static void array4(){
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Прогрессия не возрастающая");
                }
            }
        }
    }

    public static void array5(){
        int[] array=new int[20];
        for(int i=0;i<array.length;i++){
          if(i<2){
              array[i]=1;
            }
            else {
                array[i]=array[i-2]+array[i-1];
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void array6(int length, int min, int max) {
        int [] array = new int[length];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*max)+min;

        }
        System.out.println(Arrays.toString(array));
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++){
            if(maxNumber<array[i]){
                maxNumber=array[i];
                maxIndex=i;
            }
        }
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}


