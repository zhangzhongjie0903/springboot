package com.zzj.fmod.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @program: demo
 * @description: 测试使用
 * @date 2022-05-14 09:24:38
 */
public class FirstTest {
    public static void main(String[] args) throws ParseException {
//
        //System.out.println(Integer.parseInt(" "));
        BigDecimal dd = BigDecimal.valueOf(0);
        BigDecimal ss = BigDecimal.valueOf(20.3);

        System.out.println(dd.add(ss));
    }
}
