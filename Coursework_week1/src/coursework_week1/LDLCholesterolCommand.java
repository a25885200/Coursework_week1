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
public class LDLCholesterolCommand implements Command{
    Scanner sc;
    LDLCholesterol lDLCholesterol;

    public LDLCholesterolCommand(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public void execute() {
        lDLCholesterol = input(sc);
        System.out.println("Your LDL cholesterol level is" + lDLCholesterol.getlDLC());
    }
    
    public LDLCholesterol input(Scanner sca){
        double tC = 0;
        double hDLC = 0;
        double tG =0;
        System.out.println("What is your Total Cholesterol level?");
        tC = sca.nextDouble();
        System.out.println("What is your HDL cholesterol level?");
        hDLC = sca.nextDouble();
        System.out.println("What is your Triglyceride level?");
        tG = sca.nextDouble();
        
        double lDLC = tC-hDLC-tG/5;
        
        return new LDLCholesterol(lDLC, tC, hDLC, tG);
       
    }
    
    
}
