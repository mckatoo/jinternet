/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadinternet;

import views.FormPrincipal;


/**
 *
 * @author Milton Carlos Katoo
 */
public class CadInternet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormPrincipal principal = new FormPrincipal();
        principal.setExtendedState(principal.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
    
}
