package atividadem38.exceptions;

public class DAOException extends Exception{

    private static final long serialVersionUID = 7300496516865943626L;

    public DAOException(String msg, Exception ex) {
        super(msg, ex);
    }
}
