public class Carro {
    //atributo estatico
    private static int quantidadeCarros;

    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;

    public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        Carro.quantidadeCarros++;
    }
    public Carro(){}

    public void acelera(double velocidade){
        double velocidadeAcelerada = this.velocidadeAtual + velocidade;
        if (verificaVelocidadeMaxima(velocidade)) {
            this.velocidadeAtual = velocidadeAcelerada;
        }
        else {
            System.out.println("Velocidade maxima atingida");
        }
    }

    public void ligar(){
        System.out.println("Carro ligado!");
    }

    private boolean verificaVelocidadeMaxima(double velocidade){
        return velocidade < velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static int getQuantidadeCarros() {
        return quantidadeCarros;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}