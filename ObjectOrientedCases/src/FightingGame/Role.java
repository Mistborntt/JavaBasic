package FightingGame;
import java.util.Random;

public class Role {
    private String name;
    private int HP;
    private char gender;
    private String face;

    private static final String[] MANFACES = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    private static final String[] WOMANFACES = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材姣好", "相貌平平", "相貌丑陋", "惨不忍睹"};

    private static final String[] ATTACK_DESC = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空在中变掌为爪锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，锤向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，转到对方的身后，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实地锤向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    private static final String[] INJURED_DESC = {
            "结果%s退了半步，毫发无损。",
            "结果给%s造成一处瘀伤。",
            "结果一击命中，%s痛得弯下腰。",
            "结果%s痛苦地闷哼了一声，显然受了点内伤。",
            "结果%s摇摇晃晃，一跤摔倒在地。",
            "结果%s脸色一下变得惨白，连退了好几步。",
            "结果「轰」的一声，%s口中鲜血狂喷而出。",
            "结果%s一声惨叫，像滩软泥般塌了下去。",

    };

    public Role() {

    }

    public Role(String name, int HP, char gender) {
        this.name = name;
        this.HP = HP;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        String face = "";
        Random rd = new Random();

        if (gender == '男') {
            face = MANFACES[rd.nextInt(MANFACES.length)];
        } else if (gender == '女') {
            face = WOMANFACES[rd.nextInt(WOMANFACES.length)];
        } else {
            face = "面目狰狞";
        }

        this.face = face;
    }

    public void attack(Role role) {
        Random rd = new Random();
        // 攻击描述
        System.out.printf(ATTACK_DESC[rd.nextInt(ATTACK_DESC.length)], this.getName(), role.getName());
        System.out.println();

        int damage = rd.nextInt(200) + 1;
        int remainHP = role.getHP() - damage;
        // 如果剩余血量为负，修正为0
        remainHP = remainHP < 0 ? 0 : remainHP;

        role.setHP(remainHP);
        // 受伤描述
        if (role.getHP() > 900) {
            System.out.printf(INJURED_DESC[0], role.getName());
        } else if (role.getHP() > 800 && role.getHP() <= 900) {
            System.out.printf(INJURED_DESC[1], role.getName());
        } else if (role.getHP() > 700 && role.getHP() <= 800) {
            System.out.printf(INJURED_DESC[2], role.getName());
        } else if (role.getHP() > 600 && role.getHP() <= 700) {
            System.out.printf(INJURED_DESC[3], role.getName());
        } else if (role.getHP() > 400 && role.getHP() <= 600) {
            System.out.printf(INJURED_DESC[4], role.getName());
        } else if (role.getHP() > 200 && role.getHP() <= 400) {
            System.out.printf(INJURED_DESC[5], role.getName());
        } else if (role.getHP() > 100 && role.getHP() <= 200) {
            System.out.printf(INJURED_DESC[6], role.getName());
        } else if (role.getHP() <= 100) {
            System.out.printf(INJURED_DESC[7], role.getName());
        }

        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名：" + getName());
        System.out.println("血量：" + getHP());
        System.out.println("性别：" + getGender());
        System.out.println("面相：" + getFace());
    }
}
