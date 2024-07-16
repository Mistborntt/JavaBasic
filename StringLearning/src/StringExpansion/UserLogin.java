package StringExpansion;
import java.util.Objects;
import java.util.Scanner;

public class UserLogin {
    private static final String USERNAME = "Mistborntt";
    private static final String PASSWORD = "ljt001106";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "";
        String password = "";
        int count = 0;

        do {
            System.out.println("请输入用户名：");
            username = sc.next();
            System.out.println("请输入密码：");
            password = sc.next();
            count++;
        } while((!Objects.equals(username, USERNAME) || !Objects.equals(password, PASSWORD)) && count < 3);

        if (Objects.equals(username, USERNAME) && Objects.equals(password, PASSWORD)) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
