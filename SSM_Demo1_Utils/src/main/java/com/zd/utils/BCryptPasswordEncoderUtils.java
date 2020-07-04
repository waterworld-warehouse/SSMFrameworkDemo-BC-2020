package com.zd.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.utils
 * @ClassName: BCryptPasswordEncoderUtils
 * @Author: 晴天
 * @Date: 2020/4/10 18:08
 * @Version: 1.0
 */
public class BCryptPasswordEncoderUtils {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "123";
        String encodeMessage = encodePassword(password);
        System.out.println(encodeMessage);
        //第一次加密结果：$2a$10$cOXLULmsFkU8Cjgg2LEzEuZZpKehXpcz2UU2oEOOSm/NdRn.Q8emm
        //第二次加密结果：$2a$10$DYo3ReOuWg9XRRLwv2uvIefHAb2Alius5pmxVQ4Rb/1YUSf/.Qxju
    }

}
