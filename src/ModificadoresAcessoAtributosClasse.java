public class ModificadoresAcessoAtributosClasse {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setCor("Branco");
        meuCarro.setModelo("BMW");
        meuCarro.setVelocidadeAtual(0);
        meuCarro.setVelocidadeMaxima(380);
        meuCarro.acelera(40);

        System.out.println("Meu Carro: " + meuCarro.getModelo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Velocidade Atual: " + meuCarro.getVelocidadeAtual());
        System.out.println("Velocidade Maxima: " + meuCarro.getVelocidadeMaxima());
    }
}
