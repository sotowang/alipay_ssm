package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091800539494";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCQzQLLpY6ian+4KdHF4oSHNevlXA23rt0IZPzI1a+jgw9fkbcUPL3IS8VWP1yyg1MtdTTbbV56Ce43k7Yv1cfOoS0anYKqOTQqczaRLCAhFiScUdUSP7HjfUgAHxzJJOylnJ/n6LNsH7kQIC6irZ3q54BRP8KesyLQcAnePaezxy+U394qqHgssUQK4sTyU9HyGoNgHsNkp0VDPubk+wOLfXSvY3bI3kNvJBfcm4B2dVyc8fQqoYIk8dK+7rWutonJIUgc834FcABvQVYgkQJ9ZzTN7hyy1NQUL6HNT1PiFw7UFNQw1sXIJAH0LGBNLBhk1McKATQe6MxfMldbKhPtAgMBAAECggEAXpmRefpvdSyexHKN2fpjGvLfarj5PUfAn/taKttwJCM7p/RK563HT1QxWGeM6BNkBA7OuYx6bMCQIT8fh6DjKNuj2/+LnipBKnqa670oQHV29amAyqtSTI1MvMeWxtKYyJnK3nfowHr5LM/Zp+5FfXJBItPFEml2FTcdO1SMe6Zqaqf+Vox4oIYp4hUKAHz8IVnvfBTBqyngREXW9DDUGWh0WbTVz8HGjR/r+c2oqv7UD/YWXVOfQQth/MxtKy6alcC4ypnJK7M+xqlEh7kdMxgvV+Zf07Oo4rrDMt7VlvhNpr6iJX47gdXMcMPDkruU7rB3WLx7ndIZ6e0uhAk7AQKBgQDIUYJQAZ6L3LR5L1thSWfQYQd8Hkz7ezKJlZn/65lvfMGaB+fXSU3DiD0NZqaskdA7GI2217u6v54UTm11aIetsXUD53kqvLIgbzw4k0MJ2xDlC0Qc6PE+ymtLSckkgnfOcdnSJVbSN1zLiPtJtnR5dqr6RajW+eBXUtFrQqRA0wKBgQC5DOrlCHKub1905qHpdl5xH0rL0CTU7EHFWf8MIL+pztmekEbqFvUBiOusjhofUjuFr5JP9Ub+wg8JxlN2qYI+yvo+BMTTcVM9ydNNeWuZFljIxr5UZF4OEzdKwtekJV/kvf7giZWQ1rOcjMTdcBLW7b+TUBbOozqim9V81HVgPwKBgFHa3MEMqFjGiwiqDVEnycAgpgpV52cr5G7MLu2gvEYOWJ40dMxIK/qmhSwgsiL6Qnijg+UfKpsZCeOKWLgNSsPzK7m4sI6CJNeUHKuRoWc5mSG/BMo7dbkOxeEx+XttxL8bTsLMdznXXZfeFbD9WYL4ts0mAeQ2nzGPqfuGc8/5AoGACgBOua4pNJBEYncMjSeelxKP4lAPjYpvS5E/nZIviafqTw2RJ5myCDE0O5E6jDLPkLwadkPVYHNwiKC1ZhZnOamSuMNdN+hKDW7ZArjrPczdY4yKQNlj0/Lp7Bp3uSFj+2LhYZVOBhP0hSN+iFFEU2VqEzYi5WwhASTW9vYsmdUCgYA+lS6mzBXhglv6VQRI88TvWXLSEdtyz3xkXZXe0IcOXpQtm1qh/YcAUn2R1QmSyEPzxBloPZqZQYUGvQts46mzhgSsZahzK3pb80Tq8zplDpaiS/RjT51F3Zk2gZypfW6ruJmFCDzMYS1cjidHwJCzwDkmikwoC3wSdRgL0Hrigg==";


    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2IV01WHUKCIQhJ25jrFFQexhu1nhS0o8m5pDUVAbIhSI3H7SpsBLj/8yC46LhWz/6sbap8gAmWmGxugPCO3NHujTfVwyqkCmwcMHhfnZFgY+jjCtgaYTHl+OLrt3mtSDaSYxs3KCjbJfOW9ohmZ/6ukjniXB0iBvoUIx7ttvob3RB0Nf0mp3wuk/uuLTUFBxomjKyvs15LC0/p11CMWb5ss8iESHDYEoZz8llv2jFvp3jmUzTyySKBEeExvwe+8THTKbThJmPYYaN1Fx+D2UHbiumUEjcVdfPiYEfphFoOQc7bv6cs9RuGjDPM78WHL/sCU0/+RS0pckpN+ECZTPmQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/Exam/index/gouMai";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "E:\\";


    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord ) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

