package obj.Witthawin;

public class Obj079 {
    static String id079;
    String nameWitthawin;
   double value079;

    public static String getId079() {
        return id079;
    }
    public static void setId079(String id079) {
        Obj079.id079 = id079;
    }

    public String getNameWitthawin() {
        return nameWitthawin;
    }
    public void setNameWitthawin(String nameWitthawin) {
        this.nameWitthawin = nameWitthawin;
    }

    public double getValue079() {
        return value079;
    }
    public void setValue079(double value079) {
        this.value079 = value079;
    }

    public static int compare(Obj079 o1, Obj079 o2){
       if(o1.getValue079 == o2.getValue079){return 0;};
        return 0;
    }


    @Override
    public String toString(){
        return "My id is : "+id079+"My name is : " + nameWitthawin + "Myvalue is : " + value079;
    }
    
}
