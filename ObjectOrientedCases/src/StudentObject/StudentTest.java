package StudentObject;
import java.util.Objects;

public class StudentTest {
    public static void main(String[] args) {
        // 创建一个数组用来存储学生对象
        Student[] students = new Student[3];

        // 创建学生对象并添加到数组当中
        Student stu1 = new Student( "160101070098", "李锦涛", 23);
        Student stu2 = new Student( "160101070666", "闻政", 23);
        Student stu3 = new Student( "160101070888", "高佳骏", 23);

        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;

        // 要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student( "160101070999", "吕胜杰", 23);

        // 统计学生对象个数
        int count = getCount(students);

        // 学号唯一性判断
        boolean isSame = isContain(students, stu4);

        // 新建数组
        Student[] studentsExpand = createNewArray(students);

        // 要求2：添加完毕之后，遍历所有学生信息
        if (count < students.length && !isSame) {
            students[count] = stu4;
            traversalInfo(students);
        } else if (count == students.length && !isSame) {
            studentsExpand[studentsExpand.length - 1] = stu4;
            traversalInfo(studentsExpand);
        } else {
            System.out.println("学生已存在，无需添加");
        }

        // 要求3：通过id删除学生信息，如果存在则删除，如果不存在则提示删除失败
        String schoolNumber = "160101070000";
        int index = getIndex(students, schoolNumber);
        if (index == -1) {
            System.out.println("当前学号不存在，删除失败");
        } else {
            students[index] = null;
        }

        // 要求4：删除完毕之后遍历所有学生信息
        traversalInfo(students);

        // 要求5：查询数组id为“heima002”的学生，如果存在则将他的年龄+1岁
        String id  = "heima002";
        int index1 = getIndex(students, id);
        if (index1 == -1) {
            System.out.println("当前学号不存在，修改失败");
        } else {
            int age = students[index1].getAge();
            students[index1].setAge(age + 1);
        }
    }

    // 统计学生对象个数
    public static int getCount(Student[] arr) {
        int count = 0;

        for (Student i : arr) {
            if (i != null) {
                count++;
            }
        }

        return count;
    }

    // 学号唯一性判断方法
    public static boolean isContain(Student[] arr, Student stu) {
        int isSame = 0;

        for (Student i : arr) {
            if (i != null) {
                if (Objects.equals(i.getSchoolNumber(), stu.getSchoolNumber())) {
                    isSame = 1;
                    break;
                }
            }
        }

        return isSame == 1;
    }

    // 新建数组，长度+1
    public static Student[] createNewArray(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    // 遍历所有学生信息
    public static void traversalInfo(Student[] arr) {
        for (Student i : arr) {
            if (i != null) {
                System.out.println("学号：" + i.getSchoolNumber() + " 姓名：" + i.getName() + " 年龄：" + i.getAge());
            }
        }
    }

    // 指定学号对应学生对象的索引
    public static int getIndex(Student[] arr, String schoolNumber) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (Objects.equals(arr[i].getSchoolNumber(), schoolNumber)) {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }
}
