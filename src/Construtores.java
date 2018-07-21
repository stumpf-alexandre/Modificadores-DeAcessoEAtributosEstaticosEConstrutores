public class Construtores {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Amarelo", "Camaro", 0, 400);

        System.out.println("Meu: " +meuCarro.getModelo() + ", " + meuCarro.getCor() + " esta a " + meuCarro.getVelocidadeAtual() + " Km/h, mas pode chegar a " + meuCarro.getVelocidadeMaxima() + " Km/h");
        meuCarro.acelera(399);
        System.out.println("Velocidade atual: " + meuCarro.getVelocidadeAtual() + "Km/h");
    }
}
