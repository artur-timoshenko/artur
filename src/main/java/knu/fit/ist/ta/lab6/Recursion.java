/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class Recursion {

    private List<Integer> arrayToReturn;

    public List<Integer> getarrayToReturn() {
        return arrayToReturn;
    }
    
    public Recursion() {

        this.arrayToReturn = new ArrayList<>();

    }

    public int geom(int a, int q, int k) {
        if (k<=0){
            return Integer.MIN_VALUE;
        }
        if (k > 1) {
            int temp = q * geom(a, q, --k);
            this.arrayToReturn.add(temp);
            System.out.println(temp);
            return temp;
        }
        this.arrayToReturn.add(a);
        return a;
    }

    public int tailGeom(int result, int n) {

        if (n <= 1) {
            return result + n;
        }
        return tailGeom(result + n, n - 1);
    }

    public int iterationGeom(int n) {
        int result = 0;

        while (n > 0) {
            result += n;
            n--;
        }

        return result;
    }
}
