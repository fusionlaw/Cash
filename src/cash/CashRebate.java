/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cash;

/**
 *
 * @author jefy
 */
public class CashRebate extends Cash {
    private double moneyRebate = 1;
    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.valueOf(moneyRebate);
    }
    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
    
}
