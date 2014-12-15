package br.com.schumaker.run;

import br.com.schumaker.core.Engine;
import br.com.schumaker.core.NameLookup;
import br.com.schumaker.gfx.FrMain;

/**
 *
 * @author hudson.sales
 */
public class QueryNetwork {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             //   new FrMain().setVisible(true);
              //  Engine eg = new Engine();
                
               String tre[] = NameLookup.lookUp();
               
               for(String s : tre){
                   System.out.println(s);
               }
            }
        });
    }
}
