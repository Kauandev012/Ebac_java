package atividadetomcat.exceptions;

public class TipoChaveNaoEncontradaException extends Exception {

	private static final long serialVersionUID = 7672807891482444516L;
	

	public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}
