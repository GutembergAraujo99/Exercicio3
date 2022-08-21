package Exercicio3;

public class MainC {
	

    public static void main(String[] args) {

        Concessionaria Concessionaria= new Concessionaria();

        Concessionaria.adicionaCarro(4, 543., "Preto", 2022, "VW", "Nivus", "Novo", 140.000);
        Concessionaria.adicionaCarro(4, 210., "Azul", 2020, "VW", "T-Cross", "Usado", 120.000);
        Concessionaria.adicionaCarro(4, 780., "Branco", 2002, "VW", "Gol", "Usado", 67.000);
        Concessionaria.adicionaCarro(4, 1407., "Prata", 2008, "VW", "New Beattles", "Usado", 50.000);

        Concessionaria.adicionaMoto(500, 2, 1200., "Preta", 2022, "BMW", "GS1200", "Novo", 80.000);
        Concessionaria.adicionaMoto(700, 2, 740., "Branca", 2022, "Honda", "Hornet", "Usado", 40.000);
        Concessionaria.adicionaMoto(975, 2, 949., "Azul", 2022, "Yamaha", "MT-09", "Novo", 67.000);

        Concessionaria.adicionaCaminhao("Tanque", 8, 20, 15000., "Vermelho", 2020, "VN", "Modelo", "Novo", 14.000);
        Concessionaria.adicionaCaminhao("Tanque", 5, 24, 52000., "Preto", 2022, "VN", "Modelo", "Novo", 20.000);
        Concessionaria.adicionaCaminhao("Baú", 2, 32, 4000., "Verde", 2020, "VN", "Modelo", "Usado", 52.000);
        Concessionaria.adicionaCaminhao("Baú", 3, 44, 12000., "Preto", 2022, "VN", "Modelo", "Novo", 123.000);
        Concessionaria.adicionaCaminhao("Baú", 123, 24, 912000., "Branco", 2020, "VN", "Modelo", "Novo", 21.000);
        Concessionaria.adicionaCaminhao("Baú", 32, 24, 112000., "Amarelo", 2022, "VN", "Modelo", "Usado", 62.000);
        Concessionaria.adicionaCaminhao("Plataforma", 7, 551, 12000., "Branco", 2020, "VN", "Modelo", "Usado", 52.000);
        Concessionaria.adicionaCaminhao("Plataforma", 15, 2124, 18000., "Prata", 2022, "VN", "Modelo", "Novo", 10.000);
        Concessionaria.adicionaCaminhao("Caçamba", 742, 14, 25000., "Azul", 2020, "VN", "Modelo", "Usado", 730.000);
        Concessionaria.adicionaCaminhao("Caçamba", 12, 1, 35000., "Azul", 2022, "VN", "Modelo", "Novo", 90.000);

        Concessionaria.alteraPreço("Gol", 56.000);

        Concessionaria.listaNovosUsadosAmbos("Novo");
        Concessionaria.listaNovosUsadosAmbos("Usado");
        Concessionaria.listaNovosUsadosAmbos("Ambos");


        Concessionaria.listaMarca("BMW");
        ConcessionarialistaCilindradas(1200);

        Concessionaria.tiposDeCarrocerias("Tanque");
        Concessionaria.tiposDeCarrocerias("Baú");
        Concessionaria.tiposDeCarrocerias("Baú");
        Concessionaria.tiposDeCarrocerias("Plataforma");
        Concessionaria.tiposDeCarrocerias("Caçamba");

    }

	private static void ConcessionarialistaCilindradas(int i) {
		// TODO Auto-generated method stub
		
	}
}