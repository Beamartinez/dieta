
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
    private float gramosCalorias;
    private float gramosProteinas;
    private float gramosCarbohidratos;
    private float gramosGrasas;
    private float gramosAlimento;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombreUsuario)
    {
        // initialise instance variables
        this.nombreUsuario = nombreUsuario;
        gramosProteinas = 0;
        gramosCarbohidratos = 0;
        gramosGrasas = 0;
        gramosCalorias = 0;
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
        if(gramosAlimento == 0)
        {
            System.out.println("Nombre: " + nombreUsuario + "\n" + "Gramos de proteinas: 0" + "\n"
            + "Gramos de carbohidratos: 0" + "\n" + "Gramos de grasas: 0" + "\n" + "Calorias: 0");
        }
        else
        {
            System.out.println("Nombre: " + nombreUsuario + "\n" + "Gramos de proteinas: "
            + gramosAlimento + "Gramos de carbohidratos: " + gramosAlimento + "\n" +
            "Gramos de grasas: " + gramosAlimento + "\n" + "Calorias: " + gramosAlimento);
        }
    }
    
    /*
     * Comparamos la ingesta de calorias entre dos usuarios
     */
    public void ingestaCalorias(String usu2)
    {
        if(gramosCalorias > 1)
        {
            System.out.println(nombreUsuario + " ha consumido más calorias que " + usu2);
        }
    }
}
