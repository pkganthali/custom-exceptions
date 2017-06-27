package demo;

public class GreenskyServicesException extends Exception {
	private static final long serialVersionUID = 1L;

	public GreenskyServicesException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public GreenskyServicesException(String msg) {
		super(msg);
	}
	
	public GreenskyServicesException(Throwable cause) {
		super(cause);
	}
	
	public static void throwIt(String msg) throws GreenskyServicesException {
		throw new GreenskyServicesException(msg);
	}
	
	public static void wrapAndThrowIt(String msg, Throwable t) throws GreenskyServicesException {
		if(t instanceof GreenskyServicesException) {
			throw (GreenskyServicesException) t;
		}
		else {
			throw new GreenskyServicesException(msg, t);
		}
	}
}
