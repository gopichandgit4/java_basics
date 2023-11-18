package com.practise.java;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.*;
import java.util.*;
public class ObjectiveDataType {
    public static void main (String[] args){
        System.out.println("PRIMITIVE DATA TYPES");
        int x = 10;
        int y = x;
        System.out.println("INITIALLY : ");
        System.out.println("x = " + x + ", y = " +  y);
        y = 30;
        System.out.println("After Transferring y to 30");
        System.out.println("x = " + x + ", y = " +  y);

        System.out.println("REFERENCE DATA TYPES");
        int[] c = {10, 20, 30, 40};
        int[] d = c;
        System.out.println("INITIALLY");
        System.out.println("Array c = "+ Arrays.toString(c));
        System.out.println("Array c = "+ Arrays.toString(d));
        d[2] = 66;
        System.out.println("After Modification");
        System.out.println("Array c = "+ Arrays.toString(c));
        System.out.println("Array c = "+ Arrays.toString(d));





    }

}
