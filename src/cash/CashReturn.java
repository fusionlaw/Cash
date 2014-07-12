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
public class CashReturn extends Cash {
    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(String moneyCondition,String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(result >= this.moneyCondition){
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
    
}
