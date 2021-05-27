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
public class Lab5Task {
    
    public static void main(String[] args) {
        
    StringProcessing sp = new StringProcessing();
    Searching srch = new Searching();
    Sorting srt = new Sorting();
    List list = sp.getList(sp.text);
    String word = "and";
    int amount = 5;
    
    List amountOfWord = srch.linearSearch(word, list);    
    ArrayList a = sp.initList(2);
    
    System.out.println(amountOfWord);
    System.out.println("===========UnsortedList=============");
    System.out.println(sp.showList(a));
    System.out.println("===========SortedList=============");
    System.out.println(sp.showList(srt.sortApproach(a))); 
    System.out.println("===========JumpSearch=============");
    System.out.println(srch.jumpSearch(a, "h4gl")); 
    }
}
