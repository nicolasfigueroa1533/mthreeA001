/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Main {
    public static void main(String args[]){
        DVDCollection dvdCollection = new DVDCollection("dvdCollection");
    }
    
    public static void displayMenu(){
        System.out.println("Welcome to the DVD collection interface.");
        System.out.println("Please select an option by typing the corresponding number and press Enter");
        System.out.println("1.) Add DVD to the collection");
        System.out.println("2.) Remove a DVD from the collection");
        System.out.println("3.) Edit the information for an existing DVD");
        System.out.println("4.) List all DVDs currently in the collection");
        System.out.println("5.) Display all available information for a DVD");
        System.out.println("6.) Load a DVD library from a file");
        System.out.println("7.) Save a DVD library to an output file");
        System.out.println("9.) Exit");
    }
    
    public static void menuOptions(int option, DVDCollection dvdCollection){
     
        String name = "placeholder";
        switch(option){
            case 1: 
                    // add scanner
                    System.out.println("Please type the name of the DVD you wish to add.");
                    dvdCollection.addDVD(name);
                    break;
            case 2: 
                    //add scanner
                    System.out.println("Please type the name of the DVD you wish to remove");
                    dvdCollection.removeDVD(name);
                    break;
            case 3: //need to implement second menu where the options
                    //to edit a DVDs info can be listed
                    break;
            case 4:
                    break;
            case 5:
                    break;
            case 6:
                    break;
            case 7:
                    break;
        }
    }
}

