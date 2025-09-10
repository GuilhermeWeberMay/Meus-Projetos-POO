public class Carro {
    public String modelo;
    public String cor;
    public float qtdTanque = 100;
    public byte lugares;
    public boolean ligado;
    public int placa;

    // Este método é necessario para carregar um objeto no main - deve conter todos os parametros das variaveis
    public Carro(String modelo, String cor, byte lugares, boolean ligado, int placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.lugares = lugares;
        this.ligado = ligado;
        this.placa = placa;
    }

    public int getPlaca() {
        return this.placa;
    }

    public void carro(byte lugares) {
    }

    public void dirigir(float km) {
        if (ligado) {
            System.out.println("Carro sendo dirigido por " + km + "km");
            consumirCombustivel(km);
        } else {
            System.out.println("Carro desligado");
        }
    }

    public void correr(float km) {
        if (ligado) {
            System.out.println("Carro correndo por " + km + "km");
            consumirCombustivel(km);
        }
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado");
    }

    // Volta a quantidade de combustivel do tanque
    public float getQtdTanque() {
        return qtdTanque;
    }

    private void consumirCombustivel(float km) {
        this.qtdTanque -= (km * 0.3f);
    }
}
