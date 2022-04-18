
package cuentas;

/**
 * Una clase para ver el saldo de una cuenta y hacer ingresos y retiradas 
 * de dinero
 * @author Elisabet Calvo España
 * @version v 1.0 marzo_2022
 */
public class CCuenta {

    /**
     * devuelve el nombre
     * @return el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Pone el nombre que se pasa por parametro
     * @param nombre Nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve la cuenta correspondiente al titular
     * @return la cuenta bancaria del titular
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Añade la cuenta que se pasa por parametro cuenta
     * @param cuenta El parámetro cuenta define los números de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * devuelve el saldo existente 
     * @return el saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Pone el saldo que se pasa por parametro
     * @param saldo El parámetro saldo nos dice el saldo disponible
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interes
     * @return el tipo de interés de la cuenta, double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Pone el tipo de interes que se pasa por parametro
     * @param tipoInterés El parámetro tipoInteres nos dice el tipo de interés
     * de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
       
    private String nombre; // Atributo privado de tipo String. identifica el nombre
    private String cuenta; // Atributo privado de tipo String. Identifica la cuenta
    private double saldo; // Atributo privado de tipo double. Identifica el saldo
    private double tipoInterés;// Atributo privado de tipo double. Identifica el tipo de interés


    /**
     * Constructor vacio
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de nueva cuenta
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo que devuelve al metodo anterior getSaldo
     * @return Saldo
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método que permite ingresar dinero en la cuenta siempre que sea una 
     * cantidad positiva
     * @param cantidad El parámetro cantidad nos dice el dinero a ingresar
     * @throws Exception hace una llamada a exception y lanzará la excepción
     * correspondiente al error encontrado
     */
    
      public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo que permite retirar dinero de la cuenta siempre que sea una 
     * cantidad positiva y no supere el saldo disponible
     * @param cantidad Este parámetro nos dice la cantidad a retirar
     * @throws Exception hace una llamada a exception y lanzará la excepción
     * correspondiente al error encontrado
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


