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
public class ExitCommandFactory implements CommandFactory {

    @Override
    public Command createCommand() {
        return new ExitCommand();
    }

}
