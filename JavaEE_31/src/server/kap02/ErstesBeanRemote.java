/**
 * 
 */
package server.kap02;

import javax.ejb.Remote;

/**
 * @author Daniel
 *
 */
@Remote
public interface ErstesBeanRemote {
	
	public int addieren(int a, int b);

}
