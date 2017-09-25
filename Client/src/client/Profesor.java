package client;

public class Profesor extends Persona
{
    private String asignatura;

    public void setAsignatura(String asignatura)
    {
        this.asignatura = asignatura;
    }

    public String getAsignatura()
    {
        return asignatura;
    }

    public Profesor()
    {
        super();
    }

    public Profesor(String string, int i)
    {
        super(string, i);
    }
}
