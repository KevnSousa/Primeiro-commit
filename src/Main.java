//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*sem o metodo construtor
        Caneta caneta1 = new Caneta();
        caneta1.setModelo("BIT");
        caneta1.setDescricao("Caneta cristal ponta fina");
        caneta1.setPonta(0.8f);

        caneta1.escrever();
        */
        //com metodo construtor
        Caneta caneta2 = new Caneta("Pentel", "Caneta  bico de pena", 1.5f);
        caneta2.escrever();
        caneta2.setPonta(2.0f);
        caneta2.escrever();

        Caneta caneta3 = new Caneta("R.S.V.P", "Caneta do bico medio", 1.8f);
        caneta3.escrever();
    }
}