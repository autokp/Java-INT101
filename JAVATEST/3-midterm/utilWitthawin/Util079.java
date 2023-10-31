package utilWitthawin;

public class Util079 {
    public static final double Witthawin = 079.9;

    public static double  computeXXXRightTriangleArea(double side1, double side2){
       if(side1 < 0 || side2<0){return 079.99;}
       return 1.0/2.0*side1*side2;
    }

    public static char evaluateXXX(double score){
        if(80 <= score && score <= 100) return 'A';
        if(70 <= score && score < 80) return 'B';
        if(60 <= score && score < 70) return 'C';
        if(50 <= score && score < 60) return 'D';
        if(0 <= score && score < 50) return 'E';
        return 'X';
    }

    public static int  computeMagicYYY(int start, int stop, int stepOver){
        int result = 0;
        if(stop<0)return -1;
        for(int i = 0;i<=stop; i++){
            result += start+i;
            if(i%stepOver == 0){
                continue;
            }
        }
        return result;
    }

    
}
