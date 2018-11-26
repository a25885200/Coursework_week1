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
public class FatCoefficient {
    private double fC;
    private double weight;
    private double height;

    public FatCoefficient(double fC, double weight, double height) {
        this.fC = fC;
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getfC() {
        return fC;
    }

    public void setfC(double fC) {
        this.fC = fC;
    }

    @Override
    public String toString() {
        return "FatCoefficient{" + "fC=" + fC + ", weight=" + weight + ", height=" + height + '}';
    }
    
    
    
}
