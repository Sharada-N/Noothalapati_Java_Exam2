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
public class Dell implements Laptops {

    private String latestModel;

    public Dell(String latestModel) {
        this.latestModel = latestModel;
    }

    @Override
    public String dellDetails() {
        return "Latest model in Dell laptop is: " + latestModel;
    }

    @Override
    public String hpDetails() {
        return "";
    }

}
