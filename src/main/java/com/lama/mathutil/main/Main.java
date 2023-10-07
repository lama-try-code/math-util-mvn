/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lama.mathutil.main;

import com.lama.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class Main {
    
    public static void main(String[] args) {
        //test thử hàm vừa viết tính giai thừa có đúng không
        //chuản bị test case 
        //Test Case#1: check if getFactorial() runs well
        //    with n = 0
        //Test Procedures/Steps:
        //                Given n = 0
        //                Invoke getFactorial(n = 0)
        //Expected Result: 1; //0! == 1
        
        long expected = 1; //hi vọng
        int n = 0; //nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(n);
        
        //in ra và tự kết luận có giống kỳ vọng hay không
        System.out.println(n + "! expected = " + expected + 
                                " | actual = " + actual);
        
        //Test Case#2: check if getFactorial() runs well
        //    with n = 1
        //Test Procedures/Steps:
        //                Given n = 1
        //                Invoke getFactorial(n = 1)
        //Expected Result: 1; //1! == 1
        System.out.println("1! expected = 1" + 
                                " | actual = " + MathUtility.getFactorial(1));
        
    }
}
