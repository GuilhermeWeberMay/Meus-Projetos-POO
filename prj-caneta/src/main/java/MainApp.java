public class MainApp {
    public static void main(String[] args) {
        Carro carro2 = new Carro();
        Carro carro = new Carro("fordka", "Prata", 4, 418);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.ligar();
        carro.dirigir(100);
        System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
        carro.desligar();
        System.out.println(carro.getPlaca());
//       carro.ligar();
//       carro.correr(10);
//       System.out.println("Combustivel disponivel: "+carro.getQtdTanque());
//       carro.desligar();

    }
}
