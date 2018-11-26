/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week1;

import java.util.Scanner;

/**
 *
 * @author leung
 */
public class LDLCholesterolFactory implements CommandFactory {

    private Scanner sc;

    public LDLCholesterolFactory(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public Command createCommand() {
        Command c = new LDLCholesterolCommand(sc);
        return c;
    }
}
