package me.dio.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author Shackluryz
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
