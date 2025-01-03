package model.impl;

import model.api.Boundary;
import model.api.Context;
import model.api.Pacman;
import model.api.SpeedVector;
import model.api.Position;

public class PacmanImpl implements Pacman {

    private final Position actualPosition;
    private SpeedVector actualSpeed;
    private final Boundary bounds;
    private long lastUpdate;
    
    public PacmanImpl(final Position position, final Context ctx) {
        this.actualPosition = position;
        this.bounds = ctx.getBoundary();
    }

    @Override
    public void updatePosition(final SpeedVector speed) {
        final long actualTime = System.currentTimeMillis();
        final long dt = actualTime - lastUpdate;
        updateTime(actualTime);
        this.actualPosition.sum(speed.URM((v,t) -> { return new PositionImpl(((int)(v.X() * t)), ((int)(v.Y() * t))); },
                                        Long.valueOf(dt)));
        verifyBorderTouch();
    }

    /*
     * speed.URM(new BiFunction{
     *      @Override     
     *      Position apply(final SpeedVector vc, final long t) {
     *          vc.x = vc.x * t;
     *          vc.y = vc.y * t;    
     *      }
     * })
     */
    
    private void updateTime(final long time) {
        this.lastUpdate = time;
    }
            
    private void verifyBorderTouch() {
        if(this.actualPosition.X() < bounds.X0()) {
            
        }
    }
    

}
