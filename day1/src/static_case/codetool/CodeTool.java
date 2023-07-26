package static_case.codetool;

import java.util.Random;
import java.util.Scanner;
//生成验证码的工具类
public class CodeTool {
    private CodeTool() {
    }

    public static String createCode() {
        Random roll = new Random();
        Scanner sc = new Scanner(System.in);
        StringBuilder code = new StringBuilder();                       //创建一个StringBuilder可变字符串，用于连接随机生成的字符
        System.out.print("输入验证码长度: ");
        int count = sc.nextInt();
        System.out.print("选择验证码类型: 1.纯数字类型 2.大写字母加数字 3.大小写字母加数字");
        int type = sc.nextInt();
        for (int i = 0; i < count; i++) {       //变量count控制输出验证码的长度
            int type1 = roll.nextInt(type) + 1; //通过控制随机数的最大取值在1-3之间随机选择，例如最大取值为1，则只有数字
            switch (type1) {
                case 1 -> code.append((char) (roll.nextInt(10) + 48));//通过随机索引ASCLL编码控制的数字来获取随机数字(48-57)
                case 2 -> code.append((char) (roll.nextInt(26) + 65));//通过随机索引ASCLL编码控制的数字来获取随机大写字母(65-90)
                case 3 -> code.append((char) (roll.nextInt(26) + 97));//通过随机索引ASCLL编码控制的数字来获取随机数字小写字母(97-122)
            }
        }
        return code.toString();                            //返回串联好的字符串code
    }

}
