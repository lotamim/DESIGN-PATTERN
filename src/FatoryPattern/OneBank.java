/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FatoryPattern;

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class OneBank implements Bank {

    @Override
    public void bankName() {
        System.out.println("ONE");
    }

    public int numberOfEmployee(int number) {
        return number;
    }

}