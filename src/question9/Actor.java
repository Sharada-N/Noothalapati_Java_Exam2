/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Actor implements MovieRecord {

    private String name;
    private String movieName;
    private double payPerMovie;

    public Actor(String name, String movieName, double payPerMovie) {
        this.name = name;
        this.movieName = movieName;
        this.payPerMovie = payPerMovie;
    }

    @Override
    public String actorRecord() {
        return name + " has received $" + payPerMovie + " for movie " + movieName;
    }

    @Override
    public String actressRecord() {
        return "";
    }

}
