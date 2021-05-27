/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;

/**
 *
 * @author skinf
 */
@Service
public class Lab2View {
    DecimalFormat df = new DecimalFormat("###.##");

    public String showResult(String xString){
        if(xString.equals("")){return "Please enter x";}
        Float x = Float.parseFloat(xString);

 
        if(x<0) {
            return "X must be greater than 0";
        }
        else {
            return df.format(Calculate.lab2equation(x));
        }


    }
    
    
}
