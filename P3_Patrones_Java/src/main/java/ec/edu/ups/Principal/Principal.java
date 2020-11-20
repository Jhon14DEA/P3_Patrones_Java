/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Principal;

import ec.edu.ups.Context;
import ec.edu.ups.Expression;
import ec.edu.ups.HundredExpression;
import ec.edu.ups.OneExpression;
import ec.edu.ups.TenExpression;
import ec.edu.ups.ThousandExpression;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ASUS
 */
public class Principal {
    
    public static void main(String[] args) {
        
        String romano = "LXI";
        Context context = new Context(romano);
        //Construimos el arbol
        ArrayList<Expression> arbol = new ArrayList();
        arbol.add(new OneExpression());
        arbol.add(new TenExpression()); 
        arbol.add(new HundredExpression());
        arbol.add(new ThousandExpression());
        
        //imterptretamos
        
        Iterator<Expression> it = arbol.iterator();
        while (it.hasNext()) {
            Expression exp = it.next();
            exp.interpreter(context);
        }
        System.out.println(context.salida);
        
    }
}
