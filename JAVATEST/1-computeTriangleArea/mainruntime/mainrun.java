package mainruntime;

import compute.computeTriangleArea;

public class mainrun {
    public static void main(String[] args) {

       System.out.println(computeTriangleArea.setTriangle(10, 20));
       System.out.println(computeTriangleArea.setTriangle(30, 20));

///////////////////////////////////////////////////////////////////////////////

        computeTriangleArea t1 = new computeTriangleArea(30, 10);
        t1.realCompute();
        System.out.println(t1);
        
     
       
    }

}
