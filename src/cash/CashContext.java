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
public class CashContext {
    private Cash cash = null;

    public CashContext(String method) {
        switch(method){
            case "正常收费":
                cash = new CashNormal();
                break;
            case "满300返100":
                cash = new CashReturn("300","100");
                break;
            case "打8折":
                cash = new CashRebate("0.8");
                break;
        }
    }
    
    public double getResult(double money){
        return cash.acceptCash(money);
    }
}
