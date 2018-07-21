public class AtributoEstatico {
    public static void main(String[] args) {
        //System.out.println("Quantidade de carros: " + Carro.getQuantidadeCarros());

        Carro carro1 = new Carro("Cinza", "C4", 0, 300);
        Carro carro2 = new Carro("Vermelho", "Uno", 0, 270);

        System.out.println("Quantidade de carros: " + Carro.getQuantidadeCarros());
    }
}
