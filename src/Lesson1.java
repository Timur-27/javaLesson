public class Lesson1 {
    public int num (int value, int value2){
        int sumnum = value + value2;
        return sumnum;
    }

    public int num2 (int value){
        int extent = value * value;
        return extent;
    }

       public void num3 (int value, int value2){
        int sum = value + value2;
        System.out.println(sum);
    }

    public void num4 (int value){
        int remains= value % 10;
        System.out.println(remains);;
    }

    public void num5 (int value){
        int g = value;
        if (g % 2==0) {
            System.out.println("Число " + g + " четное ");
        }else{
                System.out.println("Число " + g + " нечетное ");
                }
    }

    public void string1(String value, String value2){
        String str1 = value;
        String str2 = value2;
        if(str1.equals(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        }
    }




