package work02;

public class FLTEST {
  
    private final String friend;
    private FLTEST next;

    private FLTEST(String friend) { 
        this.friend = friend; 
    }

    public static FLTEST newList() { 
        return new FLTEST(""); //["",null]
    }

    public boolean addFriend(String friend) {//Add friend method parameter(string friend name)
        if (friend.equals(null) || friend.isBlank()) { //if argument is null or blank
            return false; //return false and end program
        }

        FLTEST c = this; 

        // เพิ่มเพื ่อน
        while (c.next != null) {  
            
            c = c.next; 
        }
     
        c.next = new FLTEST(friend); 

        FLTEST c2 = this;

        while (c2.next != null) {
            
            if (friend == c2.friend) {
                
                c.next = null;
                return false;
            }
           
            c2 = c2.next;
        }

        return true;
    }
}
