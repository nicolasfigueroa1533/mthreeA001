/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
import java.util.*;
public class DVDCollection {
    String name;
    Map<String, DVD> dvdCollection = new HashMap<>();
    
    public DVDCollection(String name){
        this.name = name;
    }
    
    public void addDVD(String name, DVD dvd){
        dvdCollection.put(name, dvd);
    }
    
    public void removeDVD(String name){
        dvdCollection.remove(name);
    }
    
    public void changeName(String oldName, String newName){
        dvdCollection.get(oldName).setTitle(newName);
        dvdCollection.put(newName, dvdCollection.get(oldName));
        removeDVD(oldName);
    }
    
    public void changeReleaseDate(String name, String date){
        dvdCollection.get(name).setReleaseDate(date);
    }
    
    public void changeMPAARating(String name, String rating){
        dvdCollection.get(name).setmPAARating(rating);
    }
    
    public void changeDirectorsName(String name, String dirName){
        dvdCollection.get(name).setDirectorsName(dirName);
    }
    
    public void changeStudio(String name, String studio){
        dvdCollection.get(name).setStudio(studio);
    }
    
    public void changeUserRating(String name, String rating){
        dvdCollection.get(name).setUserRating(rating);
    }
    
    public void listDVDs(){
        for(String key : dvdCollection.keySet()){
            System.out.println(key);
        }
    }
    
    public void listValues(String name){
        dvdCollection.get(name).toString();
    }
}
