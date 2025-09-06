public class MainApp {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.ligar();
        carro.dirigir(100);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.desligar();
        //carro.ligar();
        //carro.correr(10);
        //System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        //carro.desligar();

    }
}
