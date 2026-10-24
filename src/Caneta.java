
public class Caneta {
    String modelo;
    String descricao;
    private float ponta;

    //modelo
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    //descricao
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String d){
        this.descricao = d;
    }
    //ponta
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    //DECLARAÇÃO DE UM METODO CONTRUTOR
    // o metodo contrutor nao pode retornar nada e seu nome tem de ser
    // exatamente o mesmo da classe
    public Caneta(String m, String d, float p){
        this.modelo = m;
        this.descricao = d;
        this.ponta = p;
    }

    void escrever(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Descricão: " + this.descricao);
        System.out.println("Ponta: " + this.ponta);
    }

}
