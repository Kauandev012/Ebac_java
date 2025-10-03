package atividadem38.exceptions;

public class TipoElementoNaoConhecidoException extends Exception{

    private static final long serialVersionUID = 3760387128751361630L;

    public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }
}
