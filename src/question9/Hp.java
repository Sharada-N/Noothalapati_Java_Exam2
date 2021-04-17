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
public class Hp implements Laptops {

    private String model;

    public Hp(String model) {
        this.model = model;
    }

    @Override
    public String dellDetails() {
        return "";
    }

    @Override
    public String hpDetails() {
        return "Latest model in HP model: " + model;
    }

}
