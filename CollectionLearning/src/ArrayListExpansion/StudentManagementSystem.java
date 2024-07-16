package ArrayListExpansion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<LoginUser> userList = new ArrayList<>();
        ArrayList<Student> stuList = new ArrayList<>();
        while (true) {
            mainMenu(stuList);
        }
    }

    // 主菜单
    public static void mainMenu(ArrayList<Student> list) {
        System.out.println("------------欢迎来到黑马学生管理系统------------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择:");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> addStudent(list);
            case 2 -> deleteStudent(list);
            case 3 -> updateStudent(list);
            case 4 -> queryStudent(list);
            case 5 -> {
                System.out.println("退出");
                System.exit(0);
            }
            default -> System.out.println("请重新选择");
        }
    }

    // 添加学生
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id：");
        String id = sc.next();

        // 检查id唯一性
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("学生id已存在，添加失败！");
                return;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生家庭住址：");
        String address = sc.next();

        Student stu = new Student(id, name, age, address);
        list.add(stu);

        System.out.println("添加成功！");
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("删除学生");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id：");
        String id = sc.next();

        int isPresent = 0;
        for (Student s : list) {
            if (s.getId().equals(id)) {
                list.remove(s);
                isPresent = 1;
                System.out.println("删除成功！");
            }
        }

        if (isPresent == 0) {
            System.out.println("id不存在！");
        }
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id：");
        String id = sc.next();

        int isPresent = 0;
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("请输入学生姓名：");
                String name = sc.next();
                System.out.println("请输入学生年龄：");
                int age = sc.nextInt();
                System.out.println("请输入学生家庭住址：");
                String address = sc.next();

                s.setName(name);
                s.setAge(age);
                s.setAddress(address);

                isPresent = 1;
                System.out.println("修改成功！");
            }
        }

        if (isPresent == 0) {
            System.out.println("id不存在！");
        }
    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");

        if (list.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询！");
        } else {
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (Student stu : list) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
            }
        }
    }

    // 登录界面
    public static void loginInterface(ArrayList<LoginUser> userList) {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作：1-登录 2-注册 3-忘记密码");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> userLogin(userList);
            case 2 -> userRegister(userList);
            case 3 -> recoverPassword(userList);
            case 4 -> {
                System.out.println("谢谢使用，再见！");
                System.exit(0);
            }
            default -> System.out.println("请重新选择！");
        }
    }

    // 用户登录
    public static void userLogin(ArrayList<LoginUser> userList) {
        System.out.println("登录");
        Scanner sc = new Scanner(System.in);

        String username = sc.next();
    }

    // 用户注册
    public static void userRegister(ArrayList<LoginUser> userList) {
        System.out.println("注册");

        Scanner sc = new Scanner(System.in);
        LoginUser user = new LoginUser();

        System.out.println("请输入用户名：");
        String username = sc.next();

        // 用户名验证
        int isUnique = 1;
        for (LoginUser u : userList) {
            if (u.getUsername().equals(username)) {
                isUnique = 0;
                break;
            }
        }

        int usernameLengthCheck = 0;
        if (username.length() >= 3 && username.length() <= 15) {
            usernameLengthCheck = 1;
        }

        int letter = 0;
        int notNumOrLetter = 0;
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                letter++;
            }

            if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                notNumOrLetter++;
            }
        }

        if (isUnique == 1 && usernameLengthCheck == 1 && letter > 0 && notNumOrLetter == 0) {
            user.setUsername(username);
        } else {
            System.out.println("用户名不符合要求！");
            return;
        }

        // 密码验证
        System.out.println("请输入密码：");
        String password1 = sc.next();

        System.out.println("请再次输入密码：");
        String password2 = sc.next();

        if (password1.equals(password2)) {
            user.setPassword(password1);
        } else {
            System.out.println("两次密码不一致！");
            return;
        }

        // 身份证号码验证
        System.out.println("请输入身份证号码：");
        String idno = sc.next();

        int idnoLengthCheck = 0;
        if (idno.length() == 18) {
            idnoLengthCheck = 1;
        }

        int idnoIsZeroFirst = 0;
        if (idno.charAt(0) == '0') {
            idnoIsZeroFirst = 1;
        }

        int idnoNotNumber = 0;
        for (int i = 0; i < idno.length() - 1; i++) {
            char ch = idno.charAt(i);
            if (ch < '0' || ch > '9') {
                idnoNotNumber = 1;
                break;
            }
        }

        int idnoLastCheck = 0;
        char last = idno.charAt(idno.length() - 1);
        if ((last >= '0' && last <= '9') || last == 'X' || last == 'x') {
            idnoLastCheck = 1;
        }

        if (idnoLengthCheck == 1 && idnoIsZeroFirst == 0 && idnoNotNumber == 0 && idnoLastCheck == 1) {
            user.setIdno(idno);
        } else {
            System.out.println("身份证号码不符合要求！");
            return;
        }

        // 手机号验证
        System.out.println("请输入手机号：");
        String phone = sc.next();

        int phoneLengthCheck = 0;
        if (idno.length() == 11) {
            phoneLengthCheck = 1;
        }

        int phoneIsZeroFirst = 0;
        if (phone.charAt(0) == '0') {
            phoneIsZeroFirst = 1;
        }

        int phoneNotNumber = 0;
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
            if (ch < '0' || ch > '9') {
                phoneNotNumber = 1;
                break;
            }
        }

        if (phoneLengthCheck == 1 && phoneIsZeroFirst == 0 && phoneNotNumber == 0) {
            user.setPhone(phone);
        } else {
            System.out.println("手机号不符合要求！");
        }

        // 添加进用户列表
        userList.add(user);
    }

    // 忘记密码
    public static void recoverPassword(ArrayList<LoginUser> userList) {
        System.out.println("忘记密码");
    }

    // 验证码
    public static String verificationCode(int length) {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder code = new StringBuilder();

        // 创建字母和数字集
        for (int i = 65; i <= 90; i++) {
            letters.append((char)i);
        }

        for (int i = 97; i <= 122; i++) {
            letters.append((char)i);
        }

        for (int i = 48; i <= 57; i++) {
            numbers.append((char)i);
        }

        // 添加字母
        Random rd = new Random();
        for (int i = 0; i < length - 1; i++) {
            int index = rd.nextInt(letters.length());
            char ch = letters.charAt(index);
            code.append(ch);
        }

        // 添加1位数字
        code.append(numbers.charAt(rd.nextInt(numbers.length())));

        // 打乱顺序
        for (int i = code.length() - 1; i > 0; i--) {
            int j = rd.nextInt(i + 1);

            char temp = code.charAt(i);
            code.setCharAt(i, code.charAt(j));
            code.setCharAt(j, temp);
        }

        return code.toString();
    }
}
