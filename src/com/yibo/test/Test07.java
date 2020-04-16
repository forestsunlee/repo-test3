package com.yibo.test;

/**
 * @Description
 * @Author forestsun
 * @Version V1.0.0
 * @Date 2020/4/7
 */
public class Test07 {
    public void reOrderArray(int [] array) {
        StringBuilder jNumber = new StringBuilder();
        StringBuilder oNumber = new StringBuilder();
       for(int item : array){
           if (item%2 != 0) {
               jNumber.append(String.valueOf(item)).append(",");
           }else {
               oNumber.append(String.valueOf(item)).append(",");
           }
       }

        final String string = jNumber.append(oNumber).toString();
        final String[] strNumber = string.substring(0, string.length() - 1).split(",");
        for (int i = 0; i <strNumber.length ; i++) {
            array[i] = Integer.parseInt( strNumber[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {5,96,35,74,11,25,63,10,1};
        new Test07().reOrderArray(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
