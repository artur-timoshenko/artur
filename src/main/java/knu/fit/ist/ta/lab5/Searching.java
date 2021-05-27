/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class Searching {
    
    public List<Integer> linearSearch(String word, List<String> list) {
        int result = -1;
        List<Integer> indexes = new ArrayList<Integer>();
        if (word == "") indexes.add(0);
            
        for (int i = 0; i < list.size(); i++) { 
            if (list.get(i).equals(word)) {
                indexes.add(i+1);
            }
        }
        return indexes;
    }
    
        public int jumpSearch(ArrayList<Obj> list, String x) {           
        if (list.size() == 0) return 0;
        int n = list.size();
 
        int step = (int)Math.floor(Math.sqrt(n));
 
        int prev = 0;
        while (list.get(Math.min(step, n)-1).getRdString().compareTo(x) < 0)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        
        while (list.get(prev).getRdString().compareTo(x) < 0)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (list.get(prev).getRdString().equals(x))
            return list.indexOf(list.get(prev));
 
        return -1;
    }
    
    
}
