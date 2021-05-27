/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

/**
 *
 * @author Andrey
 */
public class Lab3Task {
    
    //public static int[] def_arr = {21, 21, 5, 5, 3, 12, 40, 5};
    // public static int[] arr = arrayPopulation();
    //public static int ame = Lab3Task.amountOfMaxEl(def_arr);  
    
    public static void main(String[] args) {
          
        // Lab3Task.ArrayOutput(arr);
        
        // System.out.println("Кількість елементів з максимальною сумою цифр = ");
        //System.out.println(Lab3Task.amountOfMaxEl(arr));
                
    }
    
//    public static int getMyAme() {
//        return ame;
//    }

    public int[] arrayPopulation(int k) {   
        int[] result = new int[k];
        
        for(int i = 0; i < k; i++) {        
            result[i] = (int)(Math.random()*100);
        }   
        
        return result;
    } 
    
//    public static void ArrayOutput(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
    
    public String output(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
    
    
    public static int amountOfMaxEl(int[] arr) {       
        int z = 0; 
        int sum = 0;
        int max_sum = 0;
        int n, mod_arr;
        
        for (int i = 0; i < arr.length; i++) {
            
            mod_arr = arr[i];
            
            while (mod_arr > 0) {
                n = mod_arr%10;
                mod_arr /= 10;
                sum += n;
            }
            
            if (sum > max_sum) {
                z = 0;
                max_sum = sum; 
            } 

            if (sum == max_sum) { 
                z++;
            }
            
            sum = 0;
        }
        
        return  z;
    }
          
}
  
   
    

