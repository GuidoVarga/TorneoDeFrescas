import model.*;
import java.util.*;
import utils.Utils;
import sql.Conexion;

public class Main {

    public static void main( String[] args )
    {

        Conexion conexion = new Conexion();
        conexion.createDB();

        List<Human> spartans = Arrays.asList (
                new Spartan("Leonidas", 30, 75, 3),
                new Spartan("Cleómenes ",35,80,1),
                new Spartan("Plistarco", 35, 80 , 2),
                new Spartan("Agesípolis I", 45, 90 , 2)
        );
        List<Human> vikings= Arrays.asList(
                new Viking("Ragnar", 22, 86, 4),
                new Viking("Floki", 40, 80, 3),
                new Viking("Svend", 25, 75, 2),
                new Viking("Olaf", 50, 90, 3)
        );


        Spartan sp = (Spartan) Utils.sortByWeightAndGetFirst(spartans);
        Viking vk = (Viking) Utils.sortByWeightAndGetFirst(vikings);

        Human ganador = Playground.play(vk,sp, 30);

        if(!Objects.isNull(ganador)){
            conexion.insertarGanador(ganador);

            Mestizo mestizo = new Mestizo("Mestizo",40,90,0,0);
            Human ganadorFinal = Playground.play(ganador,mestizo, 30);
            if(!Objects.isNull(ganadorFinal)){
                conexion.insertarGanador(ganadorFinal);
            }
        }
    }
}
