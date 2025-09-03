//classe principal
public class classeMoto {

    private String marca;
    private String cor;
    private String modelo;
    private String anoFabricacao;

    //propriedades
    public classeMoto(String marca ,String cor ,String modelo ,String anoFabricacao) {

        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //metado para obter a marca
    public String getMarca(){
        return marca;
    }
    //metado para definir a marca
    public void setMarca(String marca){
        this.marca = marca;
    }

    //metado para obter a cor
    public String getCor(){
        return cor;
    }
    //metado para definir a cor
    public void setCor(String cor){
        this.cor = cor;
    }
    //metado para obter o modelo
    public String getModelo(){
        return modelo;
    }
    //metado para definir o modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    //metado para obeter o ano
    public String getAnoFabricacao(){
        return anoFabricacao;
    }
    //metado para definir o ano
    public void setAnoFabricacao(String anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    //metado principal para testar a classe
    public static void main(String[] args){
        classeMoto minhaMoto = new classeMoto();

        minhaMoto.setMarca("Harley Davidson");
        minhaMoto.setCor("Preta-chumbo");
        minhaMoto.setModelo("Iron 883");
        minhaMoto.setAnoFabricacao("2017/2018");

        System.out.println("Marca: " + minhaMoto.getMarca());
        System.out.println("Cor: " + minhaMoto.getCor());
        System.out.println("Modelo: " + minhaMoto.getModelo());
        System.out.println("Ano: " + minhaMoto.getAnoFabricacao());

    }

}




