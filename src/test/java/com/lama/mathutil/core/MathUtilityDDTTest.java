/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lama.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityDDTTest {

//    Chuẩn bị bộ data sẽ nhồi vào hàm assert()
//    Hàm trả về mảng 2 chiều để so sánh n! có bằng ? hay không  
    public static Object[][] initData() {
        Object[][] testData = {
            {0, 1}, 
            {1, 1}, 
            {3, 6}, 
            {4, 24}, 
            {5, 120}
        };
        return testData;
    }
    
//    Nhồi data vào hàm kiểm thử
    @ParameterizedTest
    @MethodSource("initData") //DDT vừa xong => trích dẫn toàn bộ data
    public void verifyFactorialGivenRightArguementReturnsOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
