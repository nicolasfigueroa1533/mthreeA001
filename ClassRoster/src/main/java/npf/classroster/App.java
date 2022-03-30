/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npf.classroster;

import npf.classroster.controller.ClassRosterController;
import npf.classroster.dao.ClassRosterDao;
import npf.classroster.dao.ClassRosterDaoFileImpl;
import npf.classroster.ui.ClassRosterView;
import npf.classroster.ui.UserIO;
import npf.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Nico
 */
public class App {

    public static void main(String[] args) {
    UserIO myIo = new UserIOConsoleImpl();
    ClassRosterView myView = new ClassRosterView(myIo);
    ClassRosterDao myDao = new ClassRosterDaoFileImpl();
    ClassRosterController controller =
            new ClassRosterController(myDao, myView);
    controller.run();
    }   
}