package com.example.interfacesample.use;

import com.example.interfacesample.used.AddCalc;
import com.example.interfacesample.used.Calculator;
import com.example.interfacesample.used.SubCalc;

public class Call {
    public static void main(String[] args) {
        Calculator a = new AddCalc();
        Integer result = a.calc(10,5);
        System.out.println("계산 결과는 (" + result + ")입니다.");
    }
}
