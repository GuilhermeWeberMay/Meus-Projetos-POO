public class MainApp {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.ligar();
        carro.dirigir(300);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.desligar();
        carro.ligar();
        carro.correr(5);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.desligar();

    }
}
