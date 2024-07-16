package StaticLearning;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student> list) {
        int maxAge = list.getFirst().getAge();

        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            maxAge = age > maxAge ? age : maxAge;
        }
        return maxAge;
    }
}
