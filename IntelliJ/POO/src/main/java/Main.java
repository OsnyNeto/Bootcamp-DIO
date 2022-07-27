public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        

        //Upcast
        Funcionario gerente = new Funcionario();
        Funcionario vendedor = new Funcionario();
        Funcionario faxineiro = new Funcionario();

        //Dowcast - Deve ser evitado
        // Gerente gerente_ =  new Funcionario();=> assim dá erro
        Vendedor vendedor_ = (Vendedor)  new Funcionario();



//        Carro carro1 = new Carro();
//
//        carro1.setCor("Azul");
//        carro1.setModelo("BMW X1");
//        carro1.setCapacidadeTanque(60);
//
//        System.out.println(carro1.getModelo());
//        System.out.println(carro1.getCor());
//        System.out.println(carro1.getCapacidadeTanque());
//        System.out.println(carro1.totalValorTanque(6.33));
//
//        Carro carro2 = new Carro("Cinza","Porsche",72);
//
//        System.out.println(carro2.getModelo());
//        System.out.println(carro2.getCor());
//        System.out.println(carro2.getCapacidadeTanque());
//        System.out.println(carro2.totalValorTanque(6.43));

    }
}
