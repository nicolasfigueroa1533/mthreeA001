/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class DVD {
    String title;
    String releaseDate;
    String mPAARating;
    String directorsName;
    String studio;
    String userRating;
       
    public DVD(String title){
        this.title = title;
        
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    
    public String getReleaseDate(){
        return this.releaseDate;
    }
    
    public void setmPAARating(String mPAARating){
        this.mPAARating = mPAARating;
    }
    
    public String getmPAARating(){
        return this.mPAARating;
    }
    
    public void setDirectorsName(String directorsName){
        this.directorsName = directorsName;
    }
    
    public String getDirectorsName(){
        return this.directorsName;
    }
    
    public void setStudio(String studio){
        this.studio = studio;
    }
    
    public String getStudio(){
        return this.studio;
    }
    
    public void setUserRating(String userRating){
        this.userRating = userRating;
    }
    
    public String getUserRating(){
        return this.userRating;
    }
    
    public String toString(){
        String elements;
        elements = "Title: " + this.getTitle() + ", " +
                   "Release Date: " + this.getReleaseDate() + ", " +
                   "MPAA Rating: " + this.getmPAARating() + ", " +
                   "Director's Name: " + this.getDirectorsName() + ", " +
                   "Studio: " + this.getStudio() + ", " +
                   "User Rating / Comments: " + this.getUserRating() + "\n";
        return elements;
    }
    
    public String[] toArray(){
        String[] dvdArray = new String[6];
        dvdArray[0] = this.getTitle();
        dvdArray[1] = this.getReleaseDate();
        dvdArray[2] = this.getmPAARating();
        dvdArray[3] = this.getDirectorsName();
        dvdArray[4] = this.getStudio();
        dvdArray[5] = this.getUserRating();
        return dvdArray;
    }
    
    public String toPrint(){
        String[] array = this.toArray();
        String printer;
        for(int i=0; i<array.length; i++){
            printer = printer + array[i];
            if(i<5){
                printer = printer + " ,";
            }
        }
        return printer;
    }
}   

