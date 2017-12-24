//package com.my.blog.website;
//
//import com.alibaba.druid.filter.config.ConfigTools;
//
//public class Test {
//
//    public static void main(String[] args) throws Exception {
//        // 密码明文
//        String[] passwords = { "sssss" };
//        String[] users = { "ssssss" };
//
//        // 用私钥加密后的密文
//        for (int i = 0; i < passwords.length; i++) {
//            String[] keyPair = ConfigTools.genKeyPair(1024 + i * 5);
//            // 私钥
//            String privateKey = keyPair[0];
//            // 公钥
//            String publicKey = keyPair[1];
//            String encpwd = ConfigTools.encrypt(privateKey, passwords[i]);
//            System.out.println(users[i] + ".publicKey=" + publicKey);
//            System.out.println(users[i] + ".password=" + encpwd);
//            // 解密
//        }
//    }
//    main
//}
