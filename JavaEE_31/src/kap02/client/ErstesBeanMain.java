package kap02.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

import kap02.server.ErstesBeanRemote;


public class ErstesBeanMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Properties p = new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
			p.put(Context.PROVIDER_URL, "jnp://localhost:1099");
			Context ctx = new InitialContext(p);
			Object ref = ctx.lookup("java:global/ErstesBean/ErstesBean");
			ErstesBeanRemote ebr = (ErstesBeanRemote) PortableRemoteObject.narrow(ref,  ErstesBeanRemote.class);
			
			System.out.println("5 + 8 = " + ebr.addieren(5, 8));
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
