
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // instance variables - replace the example below with your own
    private String nombreAlimento;
    private float gramosProteinas;
    private float gramosCarbohidratos;
    private float gramosGrasas;
    private float gramosCalorias;
    private String compMayor;

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAlimento, String compMayor, float proteinas, float carbohidratos, float grasas, float calorias)
    {
        // initialise instance variables
        this.nombreAlimento = nombreAlimento;
        proteinas = 0;
        carbohidratos = 0;
        grasas = 0;
        calorias = 0;
        this.compMayor = compMayor;
    }
    
    /*
     * Metodo para ver la información nutricional
     */
    public void muestraDatos()
    {
        System.out.println("Nombre: " + nombreAlimento + "\n" + "Proteinas: " + gramosProteinas
        + "\n" + "Carbohidratos: " + gramosCarbohidratos + "\n" + "Grasas: " + gramosGrasas
        + "\n" + "Calorias: " + gramosCalorias + "\n" + "Componente mayor: " + compMayor);
    }
    
    /*
     * Alimento mas calorico
     */
    public void calorico()
    {
        System.out.println("El alimento mas calorico ingerido por el usuario hasta el momento es: " + nombreAlimento);
    }
}
