package model.api;

import java.util.function.BiFunction;
import model.api.Position;

public interface SpeedVector {

    int X();

    int Y();

    Position URM(BiFunction<SpeedVector,Long,Position> converter, Long dt);

}
