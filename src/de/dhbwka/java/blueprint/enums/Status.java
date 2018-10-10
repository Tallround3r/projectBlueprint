package de.dhbwka.java.blueprint.enums;

import java.awt.Color;

public enum Status
{
    ACTIVE(Color.ORANGE, 0), //
    CORRECT(Color.GREEN, 1), //
    WRONG(Color.RED, -1), //
    PENDING(Color.WHITE, 0), //
    NO_ANSWER(Color.GRAY, 0); //

    private Color color;
    private int points = 0;

    private Status(Color color, int points)
    {
        this.points = points;
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public int getPoints()
    {
        return points;
    }
    
}
