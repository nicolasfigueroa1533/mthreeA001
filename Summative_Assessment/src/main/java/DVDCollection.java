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
import java.io.*;
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
    
    public void writeToFile(){
        try{
            PrintWriter out = new PrintWriter(new FileWriter("Outfile.txt"));
            for(String name : dvdCollection.keySet()){
                out.print(dvdCollection.get(name).toPrint());
            }
            out.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
        
    }
    
    public void readFile(){
        dvdCollection.clear();
        try(BufferedReader in = new BufferedReader(new FileReader("Outfile.txt"))){
            String str;
            while((str = in.readLine()) != null){
                String[] tokens = str.split(",");
                dvdCollection.put(tokens[0], new DVD(tokens[0]));
                dvdCollection.get(tokens[0]).setReleaseDate(tokens[1]);
                dvdCollection.get(tokens[0]).setmPAARating(tokens[2]);
                dvdCollection.get(tokens[0]).setDirectorsName(tokens[3]);
                dvdCollection.get(tokens[0]).setStudio(tokens[4]);
                dvdCollection.get(tokens[0]).setUserRating(tokens[5]);
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}

