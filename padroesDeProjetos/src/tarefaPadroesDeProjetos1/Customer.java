package tarefaPadroesDeProjetos1;

public class Customer {

    private final String solicitaNota;
    private final boolean temContratoEmpresa;


    public Customer(String solicitaNota, boolean temContratoEmpresa) {
        this.solicitaNota = solicitaNota;
        this.temContratoEmpresa = temContratoEmpresa;
    }

    public boolean  getTemContratoEmpresa() {
        return temContratoEmpresa;
    }

    public String getSolicitaNota() {
        return solicitaNota;
    }


}
