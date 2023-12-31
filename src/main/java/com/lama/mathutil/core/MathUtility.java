/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lama.mathutil.core;

/**
 *
 * @author ACER
 */
//đây là bộ thư viện chứa các hàm dùng trong toán học/tính toán
//toán học, clone giống class Math bên jdk
//khi gọi là thư viện dùng chung, không cần nhớ nhung gì sau khi xử lý
//=> thư viện chứa hàm static
public class MathUtility {

    public static final double PI = 3.14;

    //n < 0 && n > 20 k tính, vì 21! tràn kiểu long
    //0! = 1! = 1
//    public static long getFactorial(int n) {
//        long result = 10;
//
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid number. Number must be between 0 to 20.");
//            
//        if (n == 0 || n == 1)
//            return 1;
//
//        for (int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//    }
    //upgrade getFactorial, using recursion
    //đệ quy = gọi lại chính mình với 1 quy mô nhỏ hơn
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid number. Number must be between 0 to 20.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }
    //Việc tối ưu này đúng hay sai về chất lượng code
    //=> leader chỉ cần nhìn màu xanh là được vì nếu làm tốt => phải màu xanh, không care chi tiết
//    kĩ thuật xanh => test xanh => không cần nhìn chi tiết
//    người ta gọi là Regression test => test hồi quy
}
