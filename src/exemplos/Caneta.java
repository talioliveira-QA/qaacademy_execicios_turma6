package exemplos;

public class Caneta {
    String cor;
    String ponta = "fina";
    String marca;

    public void trocaCor(String corCliente){
        cor = corCliente;
    }
    public void rabiscar(){
        System.out.println("rabiscando");
    }
    public void pintar(){
        System.out.println("Pintando");
    }
    public void escrever(String texto){
        System.out.println("Escrevendo"+ texto);
    }
    public String mostrarCorAtual(){
        return  cor;
    }
    public void inserirMarca(String marcaCliente){
        marca = marcaCliente;
    }

}
