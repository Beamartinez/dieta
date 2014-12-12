
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombreUsuario;
    private String alimento;
    private float gramosAlimento;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombreUsuario)
    {
        // initialise instance variables
        this.nombreUsuario = nombreUsuario;
    }
    
    /*
     * Comer una cantidad variable de un alimento medida en gramos
     */
    public void comer(String alimento, float gramosAlimento)
    {
        alimento = "";
        gramosAlimento = 0;
    }
    
    /*
     * Metodo para visualizar por pantalla el estado actual de un usuario
     */
    public void verUsuario()
    {
        System.out.println("Nombre: " + nombreUsuario + "\n" + "Gramos de proteinas: "
        + gramosAlimento + "Gramos de carbohidratos: " + gramosAlimento + "\n" +
        "Gramos de grasas: " + gramosAlimento + "\n" + "Calorias: " + gramosAlimento);
    }
}
