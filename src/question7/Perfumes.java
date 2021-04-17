/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public enum Perfumes {
    POCKETSIZE(5, "Calvin Klein", "Mist"), MEDIUM(10, "Burberry London", "Rose"), LARGE(20, "Vera Wang Princess", "cherry");

    private final int quantity;
    private final String brand;
    private final String flavour;

    private Perfumes(int quantity, String brand, String flavour) {
        this.quantity = quantity;
        this.brand = brand;
        this.flavour = flavour;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavour() {
        return flavour;
    }

}
