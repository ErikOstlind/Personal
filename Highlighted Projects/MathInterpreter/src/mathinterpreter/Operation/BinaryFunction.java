/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathinterpreter.Operation;

/**
 *
 * @author ostlinja
 */
public interface BinaryFunction<I,O>{      
    O execute(I x,I y)throws Exception;
}
