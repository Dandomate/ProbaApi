package hu.fisherRaceAPI.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DOORNUMBER_ID;
    private String Door;
    private int Space;



    public ClassRoom(int DOORNUMBER_ID, String Door, int Space) {
        this.DOORNUMBER_ID = DOORNUMBER_ID;
        this.Door = Door;
        this.Space = Space;
    }

    public ClassRoom() {
    }

    public int getDOORNUMBER_ID() {
        return DOORNUMBER_ID;
    }

    public void setDOORNUMBER_ID(int DOORNUMBER_ID) {
        this.DOORNUMBER_ID = DOORNUMBER_ID;
    }

    public String getDoor() {
        return Door;
    }

    public void setDoor(String door) {
        Door = door;
    }

    public int getSpace() {
        return Space;
    }

    public void setSpace(int space) {
        Space = space;
    }
}
