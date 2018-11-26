/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week1;

/**
 *
 * @author leung
 */
public class LDLCholesterol {
    private double lDLC;
    private double tC, hDLC, tG;

    public LDLCholesterol(double lDLC, double tC, double hDLC, double tG) {
        this.lDLC = lDLC;
        this.tC = tC;
        this.hDLC = hDLC;
        this.tG = tG;
    }

    public double getlDLC() {
        return lDLC;
    }

    public void setlDLC(double lDLC) {
        this.lDLC = lDLC;
    }
    
    

    public double gettC() {
        return tC;
    }

    public void settC(double tC) {
        this.tC = tC;
    }

    public double gethDLC() {
        return hDLC;
    }

    public void sethDLC(double hDLC) {
        this.hDLC = hDLC;
    }

    public double gettG() {
        return tG;
    }

    public void settG(double tG) {
        this.tG = tG;
    }
    
    
}
