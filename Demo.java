import java.util.Scanner;

/**
 * Demo.java —— Java 入门示例程序
 * 演示：输入输出、for/while 循环、if 判断、自定义方法、数组
 * 运行方法：
 *   1. javac Demo.java      （编译）
 *   2. java Demo            （运行）
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("===== Java 示例程序开始 =====");

        // 1. 输入输出（Scanner 读取键盘输入）
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = scanner.nextLine();
        System.out.println("你好，" + name + "！");

        // 2. 循环 + 判断：打印 1~10 中能被 3 整除的数
        System.out.println("\n1~10 中能被 3 整除的数：");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        // 3. while 循环：从 1 加到 100
        int sum = 0;
        int n = 1;
        while (n <= 100) {
            sum += n;
            n++;
        }
        System.out.println("\n1 加到 100 的结果：" + sum);

        // 4. 数组
        int[] scores = {88, 95, 76, 100, 82};
        System.out.println("成绩数组中的最高分：" + maxScore(scores));

        // 5. 自定义方法
        System.out.println("计算 8 的平方：" + square(8));

        scanner.close();
        System.out.println("\n===== 示例程序结束 =====");
    }

    // 自定义方法：求数组最大值
    public static int maxScore(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (v > max) max = v;
        }
        return max;
    }

    // 自定义方法：求平方
    public static int square(int x) {
        return x * x;
    }
}
