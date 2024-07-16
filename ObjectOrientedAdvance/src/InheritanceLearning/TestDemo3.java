package InheritanceLearning;

import java.io.IOException;
import java.util.Scanner;

/*
异常声明：声明这个方法可能会抛出一个 IOException 异常。
这是 Java 中的一种受检查的异常，意味着你必须要么捕获它，要么声明抛出它。
IOException 通常表示与输入/输出操作相关的问题（例如文件处理、网络通信等）。
如果你的 main 方法执行的操作可能会导致 IOException（比如读取文件），你需要适当地处理它，可以通过 try-catch 块捕获异常，或者像这里一样声明方法可能抛出异常。
*/
public class TestDemo3 {
    public static void main(String[] args) throws IOException{
        // 利用空参构造创建子类对象
        Son s = new Son();

        System.out.println(Long.toHexString(System.identityHashCode(s)));

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Father {
    private final int a = 0x111;
    int b = 0x222;

    public void fuShow1() {
        System.out.println("public --- FuShow");
    }

    private void fuShow2() {
        System.out.println("private --- FuShow");
    }
}

class Son extends Father {
    int c = 0x333;

    public void ziShow1() {
        System.out.println("public --- ZiShow");
    }
}
