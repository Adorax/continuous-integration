/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metierTest;

import metier.Action;
import org.testng.annotations.Test;

/**
 *
 * @author maret
 */
public class ActionTest {
    @Test
    public void createAction() {
        Action a = new Action(Action.ADD, -1);
        Action a2 = new Action(Action.SEL, -1);
        Action a3 = new Action(Action.DEL);
        Action a4 = new Action(Action.LOAD);
        Action a5 = new Action(Action.LOAD, 10);
        Action a6 = new Action(Action.UPD, 50);
    }
    

    @Test
    public void getAction() {
        Action aaa = new Action(Action.ADD, -1);
        aaa.getAction();
        if (aaa.getAction() != Action.ADD) {
            System.err.println("getAction doesn't work");
        }
        aaa.getPos();
	if (aaa.getPos() != -1) {
            System.err.println("getPos doesn't work");
        }

        
    }    
}
