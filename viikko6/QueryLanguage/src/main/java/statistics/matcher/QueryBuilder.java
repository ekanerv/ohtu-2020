/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

/**
 *
 * @author emma
 */
public class QueryBuilder {
    private Matcher matcher = new All();
    
    public Matcher build() {
        return matcher;
    }
    public QueryBuilder playsIn(String team) {
        this.matcher = new And(new PlaysIn(team), matcher);
        return this;
    }
    public QueryBuilder hasAtLeast(int value, String category) {
        this.matcher = new And(new HasAtLeast(value, category), matcher);
        return this;
    }
    public QueryBuilder hasFewerThan(int value, String category) {
        this.matcher = new And(new HasFewerThan(value, category), matcher);
        return this;
    }
    public QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new And(new Or(matchers), matcher);
        return this;
    }
}
