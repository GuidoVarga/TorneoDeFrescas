import model.*;

public class Playground {

	
	public static Human play(Human player1, Human player2, int chelas){
		Human ganador = null;

		player1.setChelasRestantes(chelas);
		player2.setChelasRestantes(chelas);

		while(player1.getChelasRestantes() > 0 && player2.getChelasRestantes() > 0){
			if(player1.isNeedUrinate()){
				int orina = player1.urinate();
				System.out.println("Vikingo orina: " + orina);
			}
			else {
				int bebida = player1.drink();
				System.out.println("Vikingo toma: " + bebida);
			}
			if(player2.isNeedUrinate()){
				int orina = player2.urinate();
				System.out.println("Espartano orina " + orina);
			}
			else {
				int bebida = player2.drink();
				System.out.println("Espartano toma " + bebida);
			}
			System.out.println("\nFin de ronda");
			System.out.println("\nCervezas restantes vikingo " + player1.getChelasRestantes());
			System.out.println("\nCervezas restantes espartano " + player2.getChelasRestantes());
		}
		
		if(player1.getChelasRestantes() <= 0 && player2.getChelasRestantes() <= 0){
			System.out.println("Empate");
		}else if (player1.getChelasRestantes() <= 0){
			System.out.println("Ganador:" + player1);
			ganador = player1;
		}
		else {
			System.out.println("Ganador: " + player2);
			ganador = player2;
		}

		return ganador;
	}
}