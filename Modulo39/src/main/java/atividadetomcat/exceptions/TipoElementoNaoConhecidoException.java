package atividadetomcat.exceptions;

public class TipoElementoNaoConhecidoException extends Exception {

	private static final long serialVersionUID = -8813419863127388393L;
	
	public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }
	
}
