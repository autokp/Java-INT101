package work02;

public class FriendList {
    private final String friend;
    private FriendList next;

    private FriendList(String friend) { //constructer private for set field value
        this.friend = friend; 
    }

    public static FriendList newList() { //cuz constructer is private we cant call it in main 
        //then we call this method at main it will return new constructer ("")
        return new FriendList(""); //["",null]
    }
    // friend = "Win"
    // ["",["Most",null]]



    public boolean addFriend(String friend) {//Add friend method parameter(string friend name)
        if (friend.equals(null) || friend.isBlank()) { //if argument is null or blank
            return false; //return false and end program
        }

        // round 1
        // this.friend = ""
        // next = null
        // ["",null]
        // finish round 1
        // ["",["Most",null]]

        // round 2
        // this.friend = ""
        // next = ["Most",null]
        // ["",["Most",null]]
        // finish
        // ["",["Most",["Win",null]]]

        // round 3
        // this.friend = ""
        // next =["Most",["Win",null]]

        FriendList c = this; //change parameter friend to OBJ c

        // เพิ่มเพื ่อน
        while (c.next != null) {  //change obj c to get value of next it get datatype(FriendList)
            //round 1 false
            //round 2
            // ["Most",null]
            //round 3
                // ["Most",["Win",null]]
                // ["Win",null]
            c = c.next; //get c = c.next
        }
        //round 1
        // friend = ""
        // next = ["Most",null]

        //rounnd 2
        // friend = "Most"
        // next = ["Win",null] 

        //round 3
        // friend = "Win" (parameter)
        // next = ["Win",null]
        c.next = new FriendList(friend); //c.next = new constructer 
        //round 1
        // ["",["Most",null]]
        // round 2
        // ["",["Most",["Win",null]]]
        // round 3
        // ["",["Most",["Win",["Win",null]]]]
        FriendList c2 = this;

        // เช็คว่ามีเพื่อนชื่อนี้อยู่หรือยัง
        while (c2.next != null) {
            // round 1
            // friend = "Most"
            // c2.friend = ""

            // round 2
                // friend = "Win"
                // c2.friend = ""
                //false
                // c2.friend = "Most"
            // round 3
                // friend = "Win"
                // c2.friend = ""
                // false
                // c2.friend = "Most"
                // false
                // c2.friend = "Win"

            if (friend == c2.friend) {
                //["",["Most",["Win",null]]]  result case same name
                c.next = null;
                return false;
            }
            //round 1
            // ["Most",null]
            //round 2
                // ["Most",["Win",null]
                // ["Win",null] 
            //round 3
                // ["Most",["Win",["Win",null]]]
                // ["Win",["Win",null]]
            c2 = c2.next;
        }

        return true;
    }

    public void popFriend() {
        // this = ["",["Most",["Fern",null]]]
        // popFriend()
        // this = ["",["Most",null]]

        // ["",["Most",["Fern",null]]]
        FriendList c = this;
        // ["",["Most",["Fern",null]]]
        FriendList prev = c;
        while (c.next != null) {
            // ["",["Most",["Fern",null]]]
            // ["Most",["Fern",null]]
            prev = c;
            // ["Most",["Fern",null]]
            // ["Fern",null]
            c = c.next;
        }
        prev.next = null;

    }

    public void pushFriend(String friend) {
        FriendList c = this;
        if (c.next == null) {
            c.next = new FriendList(friend);
        }

        FriendList newObj = new FriendList(friend);
        newObj.next = c.next;

        this.next = newObj;

    }

    // ["Most",....]
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        // ["",["Most",null]]

        FriendList c = this.next;
        // ["",["Most",null]]
        // ["Most",null]
        while (c != null) {
            s.append(c.friend);
            c = c.next;
            if (c != null) {
                s.append(", ");
            }
        }

        return s.toString();
    }

}
