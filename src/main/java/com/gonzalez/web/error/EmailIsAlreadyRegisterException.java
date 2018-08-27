package com.gonzalez.web.error;

public class EmailIsAlreadyRegisterException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4881183134948702369L;
	
	public EmailIsAlreadyRegisterException()
	{
		super();
	}
	
	 public EmailIsAlreadyRegisterException(String message) {
	        super(message);
	    }

	    /**
	     * Constructs a new runtime exception with the specified detail message and
	     * cause.  <p>Note that the detail message associated with
	     * {@code cause} is <i>not</i> automatically incorporated in
	     * this runtime exception's detail message.
	     *
	     * @param  message the detail message (which is saved for later retrieval
	     *         by the {@link #getMessage()} method).
	     * @param  cause the cause (which is saved for later retrieval by the
	     *         {@link #getCause()} method).  (A <tt>null</tt> value is
	     *         permitted, and indicates that the cause is nonexistent or
	     *         unknown.)
	     * @since  1.4
	     */
	    public EmailIsAlreadyRegisterException(String message, Throwable cause) {
	        super(message, cause);
	    }

	    /** Constructs a new runtime exception with the specified cause and a
	     * detail message of <tt>(cause==null ? null : cause.toString())</tt>
	     * (which typically contains the class and detail message of
	     * <tt>cause</tt>).  This constructor is useful for runtime exceptions
	     * that are little more than wrappers for other throwables.
	     *
	     * @param  cause the cause (which is saved for later retrieval by the
	     *         {@link #getCause()} method).  (A <tt>null</tt> value is
	     *         permitted, and indicates that the cause is nonexistent or
	     *         unknown.)
	     * @since  1.4
	     */
	    public EmailIsAlreadyRegisterException(Throwable cause) {
	        super(cause);
	    }


}
