public class Carro {
    public String modelo;
    public String cor;
    public float qtdTanque = 100;
    public byte lugares;
    public boolean ligado;

    public void dirigir(float km){
        if(ligado){
            System.out.println("Carro sendo dirigido por "+km+"km");
            consumirCombustivel(2);
        }else {
            System.out.println("Carro desligado");
        }
    }
    public void correr(float km){
        if(ligado){
            System.out.println("Carro correndo por "+km+"km");
            consumirCombustivel(5);
        }
    }
    public void ligar(){
        ligado = true;
        System.out.println("Carro ligado");
    }
    public void desligar(){
        ligado = false;
        System.out.println("Carro desligado");
    }
    // Volta a quantidade de combustivel do tanque
    public float getQtdTanque() {
        return qtdTanque;
    }
    private void consumirCombustivel(int qtd){
        this.qtdTanque -= qtd;
    }
}
