/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathinterpreter.Operation;

import java.util.ArrayList;

/**
 *
 * @author ostlinja
 */
public interface PairFunction<K>{
    public K execute(ArrayList a)throws Exception;
}
