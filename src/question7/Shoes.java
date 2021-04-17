/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Sharada Devi Noothalapti
 */
public enum Shoes {
    LowQUALITY("Dressberry", 8), AVERAGEQUALITY("Nike", 9), HIGHQUALITY("Adidas", 10);

    private final String brand;
    private final int size;

    private Shoes(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

}
