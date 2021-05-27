/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab7;

/**
 *
 * @author Andrey
 */
public class bundle {
     int value;
    bundle left;
    bundle right;

    bundle(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
