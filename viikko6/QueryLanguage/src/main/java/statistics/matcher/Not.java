/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author emma
 */
public class Not implements Matcher {

    private Matcher matcher;
    
    public Not (Matcher matcher) {
        this.matcher = matcher;
    }
    @Override
    public boolean matches(Player p) {
        if (matcher.matches(p)) {
            return false;
        }
        return true;
    }
    
}
