/****************************************************************************
 * My assingment1-08
 * Created by: Gavin Zhou 
 * Created on: Mar 2018
 *
 ****************************************************************************/

import java.util.Random;

 public class MMV{
     public static void main(String[] args) {

     int randomArray[] = new int[10];

     
     for(int i = 0;i < randomArray.length; i++) {
         randomArray[i] = (int)(Math.random() * 99);
     }
     
     int max = randomArray[0];
     int min = randomArray[0];

     for(int j = 0;j < randomArray.length;j++){
              System.out.println(randomArray[j]);


     for(int x = 0; x<randomArray.length;x++){
               if(randomArray[x] < max){
               max = randomArray[x];
               }
               
     for(int q = 0; q<randomArray.length;q++){
               if(randomArray[x] > min){
               min = randomArray[x];
               }
               }
     }
     }
     
     System.out.println("The maximum value is: "+max);
     System.out.println("The minimum value is: "+min);

     }
} 

