
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Changer {

    private Change change;
    private ArrayList<Change> changeList;

    public Changer() {

        ArrayList<Change> changeList = new ArrayList<Change>();
        this.changeList = changeList;

    }

    public void addChange(Change changeA) {
        //adds neew change to the changer

        changeList.add(changeA);

    }

    public String change(String characterString) {
 
        String aString = characterString;
        for (Change changeA : changeList) {

            aString = changeA.change(aString);

          

        }

        return aString;

    }
}
