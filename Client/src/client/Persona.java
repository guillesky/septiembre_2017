package client;

public class Persona
{
    private String nombre;
    private int dni;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Persona(String nombre, int dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setDni(int dni)
    {
        this.dni = dni;
    }

    public int getDni()
    {
        return dni;
    }

    public Persona()
    {
        super();
    }
}
