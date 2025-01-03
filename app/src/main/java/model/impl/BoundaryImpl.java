package model.impl;

import model.api.Boundary;

public class BoundaryImpl implements Boundary{

    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;

    

    public BoundaryImpl(final int x0, final int y0, final int x1, final int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public int X0() {
        return this.x0;
    }

    @Override
    public int Y0() {
        return this.y0;
    }

    @Override
    public int X1() {
        return this.x1;
    }

    @Override
    public int Y1() {
        return this.y1;
    }

}
