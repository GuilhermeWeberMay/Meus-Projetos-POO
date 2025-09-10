public class MainApp {
    public static void main(String[] args) {
        Carro carro = new Carro(8670);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.ligar();
        carro.dirigir(100);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.desligar();
        System.out.println(carro.getPlaca());
        //carro.ligar();
        //carro.correr(10);
        //System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        //carro.desligar();

    }
}
