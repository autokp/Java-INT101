package mainpack;

import obj.pornput.Obj065;
import utilWitthawin.Util079;

public class Main079 {
    public static void main(String[] args) {
        testZ();
    }

    public static void testZ(){
        System.out.println(Util079.Witthawin); // 3.1

        System.out.println(Util079.computeXXXRightTriangleArea(2,2)); //3.2

        System.out.println(Util079.evaluateXXX(81));//3.3
        System.out.println(Util079.evaluateXXX(70));//3.3
        System.out.println(Util079.evaluateXXX(65));//3.3
        System.out.println(Util079.evaluateXXX(55));//3.3
        System.out.println(Util079.evaluateXXX(45));//3.3
        System.out.println(Util079.evaluateXXX(109));//3.3

        System.out.println(Util079.computeMagicYYY(0,20,5)); //3.4
        System.out.println(Util079.computeMagicYYY(0,-20,5));

        Obj065 o1 = new Obj065("001", "Sood", 15);
        Obj065 o2 = new Obj065("002", "Orn", 20);

        o1.setValue065(20);
        o2.setValue065(30); //4.3
        o1.getValue065();
        o2.getValue065();

        System.out.println(o1);//4.4
        System.out.println(o2);

        o1.setValue065(30);
        o2.setValue065(30); //4.3
        System.out.println(Obj065.compare(o1, o2));//0
        o1.setValue065(20);
        o2.setValue065(30); //4.3
        System.out.println(Obj065.compare(o1, o2));//-1
        o1.setValue065(40);
        o2.setValue065(20); //4.3
        System.out.println(Obj065.compare(o1, o2));//1

        o1.setValue065(40);
        o2.setValue065(20); //4.4

        System.out.println(o1.isGreaterthan(o2)); // true

        o1.setValue065(10);
        o2.setValue065(20); //4.4

        System.out.println(o1.isGreaterthan(o2)); // false
    }
}

