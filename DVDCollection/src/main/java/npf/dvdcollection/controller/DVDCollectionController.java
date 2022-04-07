/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npf.dvdcollection.controller;

import java.util.List;
import npf.dvdcollection.dao.DVDCollectionDao;
import npf.dvdcollection.dao.DVDCollectionDaoException;
import npf.dvdcollection.dto.DVD;
import npf.dvdcollection.ui.DVDCollectionView;
import npf.dvdcollection.ui.UserIO;
import npf.dvdcollection.ui.UserIOConsoleImpl;

/**
 *
 * @author Nico
 */
public class DVDCollectionController {
    private DVDCollectionView view;
    private DVDCollectionDao dao;
    private UserIO io = new UserIOConsoleImpl();
    
    public DVDCollectionController(DVDCollectionDao dao, DVDCollectionView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createDVD();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (DVDCollectionDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

        private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createDVD() throws DVDCollectionDaoException {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayCreateSuccessBanner();
    }

    private void listStudents() throws DVDCollectionDaoException {
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }

    private void viewStudent() throws DVDCollectionDaoException {
        view.displayDisplayDVDBanner();
        String dvdId = view.getDVDChoice();
        DVD dvd = dao.getDVD(dvdId);
        view.displayStudent(dvd);
    }

    private void removeStudent() throws DVDCollectionDaoException {
        view.displayRemoveDVDBanner();
        String dvdId = view.getDVDChoice();
        DVD removedDVD = dao.removeDVD(dvdId);
        view.displayRemoveResult(removedDVD);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
