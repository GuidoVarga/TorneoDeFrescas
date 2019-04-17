package utils;

import java.util.*;

import model.Human;

public class Utils {

	public static Human sortByWeightAndGetFirst(List<Human> Humans){
        return Humans.stream()
                .sorted(Comparator.comparing(human -> human.getWeight()))
                .findFirst()
                .get();
    }
}
