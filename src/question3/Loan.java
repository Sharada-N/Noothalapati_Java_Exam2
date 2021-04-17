/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sharada Devi Noothalapati
 */
public class Loan {

    private int accountNum;
    private String holderName;
    private String bankName;

    public Loan(int accountNum, String holderName, String bankName) {
        this.accountNum = accountNum;
        this.holderName = holderName;
        this.bankName = bankName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNum + ", Account Holder Name: " + holderName + ", Bank Name: " + bankName;
    }

}
