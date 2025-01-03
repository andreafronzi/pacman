package model.impl;

import model.api.SpeedVector;
import model.api.SpeedVectorFactory;

public class SpeedVectorFactoryImpl implements SpeedVectorFactory{

    @Override
    public SpeedVector getNorthSpeedVector() {
        return new SpeedVectorImpl(0, 1);
    }

    @Override
    public SpeedVector getSouthSpeedVector() {
        return new SpeedVectorImpl(0, -1);
    }

    @Override
    public SpeedVector getWestSpeedVector() {
        return new SpeedVectorImpl(-1, 0);
    }

    @Override
    public SpeedVector getEastSpeedVector() {
        return new SpeedVectorImpl(0, 1);
    }

}
