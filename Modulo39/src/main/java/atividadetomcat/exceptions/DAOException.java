package atividadetomcat.exceptions;

public class DAOException extends Exception  {
	
	private static final long serialVersionUID = 3082913957040557903L;

	public DAOException(String msg, Exception ex) {
		super(msg, ex);
    }
}
