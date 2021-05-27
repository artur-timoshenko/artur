/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

/**
 *
 * @author Andrey
 */
public class FirstJavaClass {

    private int myInt;
    private static int myStaticint;
    
    public FirstJavaClass() {
    }

    public FirstJavaClass(int myInt) {
        this.myInt = myInt;
    }
    
    

    public static int getMyStaticint() {
        return myStaticint;
    }

    public static void setMyStaticint(int aMyStaticint) {
        myStaticint = aMyStaticint;
    }

    

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return "MyFirstJavaClass{" + "myInt=" + myInt + '}';
    }
    
    
    public static String toStringStatic() {
        return "MyFirstJavaClass{" + "myStaticint=" + myStaticint + '}';
    }

}