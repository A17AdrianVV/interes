
package proyecto_interes;

/**
 * Cálculo de interés simple = capital * redito * tiempo/100.
 * @author: profesor
 */
public class Interes {

  /**
   * x - Constante
   * Capital - variable tipo float que representa a cantidade inicial de diñeiro
   * Redito - variable tipo float que representa o porcentaxe xerado sobre o tempo
   * Tiempo - variable tipo int que representa o tempo que o capital xera beneficios
   */
    public int x=2;
    private float capital;
    private float redito;
    private int tiempo;
        
  /**
   *
   * @param capital Valor float con valor mayor que 0;
   * @param redito  Valor float. El valor puede ser negativo o 0;
   * @param tiempo  Valor enteiro con valor mayor que 0;
   */
  public Interes(float capital, float redito, int tiempo) {        
        this.capital=capital;
        this.redito=redito;
        this.tiempo=tiempo;
    }

  /**
   * Calcula e devolve o Interés
   * @return Devolve o Interés calculado como valor double.
   * @throws Exception se capital ou interés menor ca 0.
   */
  public double CalcularInteres()throws Exception{
        if (capital<=0)
            throw (new Exception ("Error. El capital tiene que ser >=0"));
        if (tiempo<=0)
            throw (new Exception ("Error. El interés tiene que ser >=0"));
        x=25;
        return (double)capital*redito*tiempo/100;
    }
}
