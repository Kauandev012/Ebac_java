package atividadem38.exceptions;

public class TipoChaveNaoEncontradaException extends Exception  {

    private static final long serialVersionUID = 2906910572783539725L;

    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}
