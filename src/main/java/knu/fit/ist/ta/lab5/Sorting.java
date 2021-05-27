/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Andrey
 */
public class Sorting {

    public ArrayList<Obj> sortApproach(ArrayList<Obj> list) {    
        int s, t; //temp indexes

        List<Integer> result = new ArrayList<>();
        ArrayList<Obj> listResult = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {  
            result.add(list.get(i).getRdInt());
        }

        int n = result.size() - 1;
        int k = -1; //all unsorted

        //Put current minimal element into its place
        while (k != n) {
            s = k + 1;
            t = s;

            //find minimal elevent (index s) in index rang [k,n]
            while (t != n) {
                t++;
                if (result.get(t) < result.get(s)) {
                    s = t;
                }
            }

            // exchange elements with indexes s and k+1
            t = result.get(k + 1);
            result.set(k + 1, result.get(s));
            result.set(s, t);

            k++;
        }
           
        for (int i = 0; i < list.size(); i++) {  
            for (int j = 0; j < list.size(); j++) {
                if (result.get(i) == list.get(j).getRdInt()) {
                    listResult.add(list.get(j));
                }
            }
        }
        
        return listResult;
    }
     
}
