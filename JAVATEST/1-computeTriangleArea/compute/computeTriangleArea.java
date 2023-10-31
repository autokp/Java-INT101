package compute;

public class computeTriangleArea {
    public static double base;
    public double height;
    public double triangle;

    public static double setTriangle(double base, double height) {

        return 1.0 / 2.0 * base * height;
    }

    //////////////////////////////////////////////////////////////

    public computeTriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void realCompute() {
        this.triangle = 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "triangle is : " + triangle;
    }

}
