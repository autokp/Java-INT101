package obj.pornput;

public class Obj065 {
    private static String id065;
    private String namePornput;
    private double value065;

    public Obj065(String id065, String namePornput, double value065) {
        Obj065.id065 = id065;
        this.namePornput = namePornput;
        this.value065 = value065;
    }

    public static String getId065() {
        return id065;
    }

    public static void setId065(String id065) {
        Obj065.id065 = id065;
    }

    public String getNamePornput() {
        return namePornput;
    }

    public void setNamePornput(String namePornput) {
        this.namePornput = namePornput;
    }

    public double getValue065() {
        return value065;
    }

    public void setValue065(double value065) {
        this.value065 = value065;
    }

    public static int compare(Obj065 o1,Obj065 o2){
        if(o1.getValue065()==o2.getValue065()){
            return 0;
        }else if(o1.getValue065() < o2.getValue065()){
            return -1;
        }
        return 1;
    }

    public boolean isGreaterthan(Obj065 o){
        //Obj065  o1 =new obj065(0 0 0)
        //o1.isGT
        if(this.value065 > o.getValue065()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.namePornput + ", " 
        + this.id065 + ", " + this.value065;
    }
}
