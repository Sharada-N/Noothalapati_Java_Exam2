/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class CarInsurance extends Insurance {

    private String carNum;

    public CarInsurance(String carNum, String firstName, String lastName, int incNumber) {
        super(firstName, lastName, incNumber);
        this.carNum = carNum;
    }

    public String getCarNum() {
        return carNum;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "---------------------car Insurance tostring method---------------------"
                + "\n" + "car Number: " + carNum;
    }

}
