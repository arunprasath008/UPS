package programs;

import java.util.HashSet;
import java.util.Set;

public class conference{
    public Set<Integer> checked= new HashSet<>();
    public void checkin(int id) {
        if (checked.add(id)) {
            System.out.println("Attendee " + id + " checked in.");
        } else {
            System.out.println("Attendee " + id + " is already checked in.");
        }
    }
    public boolean ischecked(int id) {
        return checked.contains(id);
    }
    public void removecheckin(int id) {
        if (checked.remove(id)) {
            System.out.println("Attendee " + id + " has been removed from check-in.");
        } else {
            System.out.println("Attendee " + id + " was not found in the check-in list.");
        }
    }
    public void displayallcheckedIn() {
        System.out.println("Checked-in: " + checked);
}
    public static void main(String[] args){
        conference man = new conference();
        man.checkin(100);
        man.displayallcheckedIn();
        man.removecheckin(100);
        man.ischecked(100);
}
}

