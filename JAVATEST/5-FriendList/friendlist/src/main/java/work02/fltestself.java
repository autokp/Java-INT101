package work02;

public class fltestself {
    private String friend;
    private fltestself next;

    private fltestself(String friend) {
        this.friend = friend;
    }

    public static fltestself helpconstructer() {
        return new fltestself("");
    }

    public boolean addFriend(String addfriend) {
        if (addfriend.equals(null) || addfriend.isBlank()) {
            return false;
        } else {
            fltestself c = this;
            //checklogic
            fltestself checkNext = this.next;
            while(checkNext != null){
                if(checkNext.friend.equals(addfriend)){
                    return false;
                }
                checkNext = checkNext.next;
            }
            //checklogic
            while (c.next != null) {
                c = c.next;
            }
            c.next = new fltestself(addfriend);
        }

        return true;

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        fltestself c = this.next;

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
