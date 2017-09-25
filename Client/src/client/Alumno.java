package client;

public class Alumno extends Persona
{
    private String legajo;

    public void setLegajo(String legajo)
    {
        this.legajo = legajo;
    }

    public String getLegajo()
    {
        return legajo;
    }

    public Alumno()
    {
        super();
    }

    public Alumno(String string, int i)
    {
        super(string, i);
    }
}
