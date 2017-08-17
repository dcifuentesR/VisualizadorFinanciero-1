/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.visualizadorfinanciero;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapts from an enumeration interface to an enumeration interface.
 * @author 2116387
 */
public class EnumerationAdapter implements Iterator{
    
    /**
     * The interface to be adapted
     */
    public Enumeration enumerator;
    
    /**
     * Creates a new enumeration adapter.
     * @param enume the enumerator to be adapted.
     */
    public EnumerationAdapter(Enumeration enume)
    {
        enumerator=enume;
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean hasNext() {
        return enumerator.hasMoreElements();
    }

    /**
     * 
     * @return 
     */
    @Override
    public Object next() {
        return enumerator.nextElement();
    }
    
}
