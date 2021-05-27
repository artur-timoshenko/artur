/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class ForTests {
     ArrayList<TestObj> test1 = new ArrayList<TestObj>(5);
     ArrayList<TestObj> test2 = new ArrayList<TestObj>(5);
     ArrayList<TestObj> test3 = new ArrayList<TestObj>(5);
     ArrayList<TestObj> test4 = new ArrayList<TestObj>(5);
     
       
    public ArrayList<TestObj> getList1() {
        TestObj TestObj1 = new TestObj("abur", -1);   
        TestObj TestObj2 = new TestObj("kabl", 5);
        TestObj TestObj3 = new TestObj("ribl", 80);
        TestObj TestObj4 = new TestObj("ertu", 3);
        TestObj TestObj5 = new TestObj("qwon", 456); 
        

            test1.add(TestObj1);
            test1.add(TestObj2);
            test1.add(TestObj3);
            test1.add(TestObj4);
            test1.add(TestObj5);
            
        return test1;   
    }
    
    public ArrayList<TestObj> getList2() {
        TestObj TestObj1 = new TestObj("", -1);   
        TestObj TestObj2 = new TestObj("", 5);
        TestObj TestObj3 = new TestObj("", 80);
        TestObj TestObj4 = new TestObj("", 3);
        TestObj TestObj5 = new TestObj("", 456); 
        

            test2.add(TestObj1);
            test2.add(TestObj2);
            test2.add(TestObj3);
            test2.add(TestObj4);
            test2.add(TestObj5);
            
        return test2;   
    }
    
    public ArrayList<TestObj> getList3() {     
        return test3;   
    }
     
    public static ArrayList<TestObj> sortApproach(ArrayList<TestObj> list) {    
        int s, t; //temp indexes

        List<Integer> result = new ArrayList<>();
        ArrayList<TestObj> listResult = new ArrayList<>();
        
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
    
     public int jumpSearch(ArrayList<TestObj> list, String x)
    {
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
    
     public static  ArrayList<String> showList(ArrayList<TestObj> list) {
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {  
            TestObj tmp = list.get(i);
            list1.add(tmp.getRdString() + " - " + tmp.getRdInt());
        }  
        return list1;
    }
}
