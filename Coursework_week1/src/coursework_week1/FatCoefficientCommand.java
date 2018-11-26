/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week1;

import java.util.*;

/**
 *
 * @author leung
 */
public class FatCoefficientCommand implements Command {

    Scanner sc;
    FatCoefficient fat;

    public FatCoefficientCommand(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void execute() {
        
        fat = input(sc);
        if (fat.getfC() > 25) {
            System.out.println("Too Fat, need to keep fit!");
        } else if (fat.getfC() < 15) {
            System.out.println("Too Thin, need to keep fat!");
        } else {
            System.out.println("Just fit, keep on!");
        }

    }

    public FatCoefficient input(Scanner sca) {
        double weight = 0;
        double height = 0;
        System.out.println("What is your weight(kg)?");
        weight = sc.nextDouble();
        System.out.println("What is your height(m)?");
        height = sc.nextDouble();

        double fC = weight / (height * height);

        return new FatCoefficient(fC, weight, height);
    }

}
