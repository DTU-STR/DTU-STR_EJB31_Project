/**
 * 
 */
package kap02.server;

import javax.ejb.Remote;

/**
 * @author Daniel
 *
 */
@Remote
public interface ErstesBeanRemote {
	
	public int addieren(int a, int b);

}
