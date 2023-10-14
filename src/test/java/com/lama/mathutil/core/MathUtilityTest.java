/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lama.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.lama.mathutil.core.MathUtility.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {
    //Thư viện - nơi cung cấp các hàm để chúng ta dùng
    //Framework - cũng là thư viện, tuy nhiên phải viết theo một trình tự nhất định. Nếu không có => không chạy
    
    
    //Cấu trúc test case: ID - Description - Steps/Procedure - Expected Result - Status
    //Test Case #1: Verify getFactorial with n = 0
    //Steps: 
    //      1. Given n = 0
    //      2. Invoke getFactorial(n = 0)
    //Expected Result: 
    //                  The method must return 1 as the result of 0! 
    //Status: PASSED | FAILED
    @Test 
    public void verifyFactorialGivenRightArguement0ReturnOk() {
        assertEquals(1, getFactorial(0));
    }
    
    //Test Case #2: Verify getFactorial with n = 1
    //Steps: 
    //      1. Given n = 1
    //      2. Invoke getFactorial(n = 1)
    //Expected Result: 
    //                  The method must return 1 as the result of 1! 
    //Status: PASSED
    @Test 
    public void verifyFactorialGivenRightArguement1ReturnOk() {
        assertEquals(1, getFactorial(1));
    }
    
    //Test Case #3: Verify getFactorial with n = 5
    //Steps: 
    //      1. Given n = 5
    //      2. Invoke getFactorial(n = 5)
    //Expected Result: 
    //                  The method must return 120 as the result of 5! 
    //Status: PASSED
    @Test 
    public void verifyFactorialGivenRightArguement2ReturnOk() {
        assertEquals(120, getFactorial(5));
    }
}
