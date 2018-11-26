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
public class Coursework_week1 {
   
    /**
     * @param args the command line arguments
     */
     public static Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String, CommandFactory> f = new HashMap<>();
        
        f.put("q", new ExitCommandFactory());
        f.put("f", new FatCoefficientFactory(sc));
        f.put("l", new LDLCholesterolFactory(sc));
        
        String command;
        System.out.println("Week 1 corusework");
        while(true){
            System.out.println("Please enter command: [q|f|l]\n"
                   +"q = exit, f = FatCoefficient, l = LDLCholesterolFactory");
            command = sc.next();
            Command com = f.get(command).createCommand();
            com.execute();
        }

    }
    
}
