/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sharada Devi Noothalapti
 */
public class Actress implements MovieRecord{
    private String name;
    private String movieName;
    private double pay;

    public Actress(String name, String movieName, double pay) {
        this.name = name;
        this.movieName = movieName;
        this.pay = pay;
    }
    
    @Override
    public String actorRecord() {
        return "";
    }

    @Override
    public String actressRecord() {
        String statement = name+ " has received $" + pay +" for movie "+movieName;
        return statement;
    }
    
}
