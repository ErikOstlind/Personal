/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathinterpreter;

/**
 *
 * @author ostlinja
 */
public interface OnePartFunction<E> extends FunctionInterface
{      
    String execute(E x);
}