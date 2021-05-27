/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author Andrey
 */
public class TestObj {
    SecureRandom random = new SecureRandom();
    
    String rdString = new BigInteger(5, random).toString(32);
    int rdInt = (int) (Math.random()*10);
    
    public TestObj(String s, int i) {
        this.rdString = s;
        this.rdInt = i;
    }
    
    public String getRdString() {
        return rdString;
    }
    
    public int getRdInt() {
        return rdInt;
    }
    
    public void setRdString(String s) {
        this.rdString = s;
    }
    
    public void setRdInt(int i) {
        this.rdInt = i;
    }
}
