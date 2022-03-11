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
        elements = "Title: " + this.getTitle() + "\n" +
                   "Release Date: " + this.getReleaseDate() + "\n" +
                   "MPAA Rating: " + this.getmPAARating() + "\n" +
                   "Director's Name: " + this.getDirectorsName() + "\n" +
                   "Studio: " + this.getStudio() + "\n" +
                   "User Rating / Comments: " + this.getUserRating() + "\n";
        return elements;
    }
}
