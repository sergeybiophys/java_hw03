package org.itstep.task03;

public final class Triangle {
    private final float sideA;
    private  final float sideB;
    private  final float sideC;

    public Triangle(float sideA, float sideB,float sideC) throws CreateTriangleException
    {
        if(sideA+sideB<sideC||sideB+sideC<sideA||sideA+sideC<sideB)
            throw new CreateTriangleException("With such sides it is impossible to build a triangle ");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }
}
