/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

/**
 *
 * @author User
 */
public class FuzzyMapData
{
    Integer pes;
    Double ri;
	
	public FuzzyMapData( Integer pes, Double ri) {
		super();
		this.pes = pes;
		this.ri = ri;
	}
	
	
	public Integer getPes() {
		return pes;
	}
	public void setPes(Integer pes) {
		this.pes = pes;
	}
	public Double getRi() {
		return ri;
	}
	public void setRi(Double ri) {
		this.ri = ri;
	}
    
}
