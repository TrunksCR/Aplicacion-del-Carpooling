package com.example.appcarpooling;



/**
 * Clase que representa un Chofer en el sistema de carpooling.
 */


public class ChoferModel {


    /**
     * Constructor de la clase ChoferModel con parámetros.
     *
     * @param name       El nombre del chofer.
     * @param ID         El ID del chofer.
     * @param contraseña La contraseña del chofer.
     */



    public ChoferModel(String name, int ID, String contraseña) {
        this.name = name;
        this.ID = ID;
        this.contraseña = contraseña;
    }

    // Constructor sin argumentos necesario para Retrofit

    /**
     * Constructor sin argumentos necesario para Retrofit.
     */


    public ChoferModel() {
        // Se deja vacío
    }
    private String name;
    private int ID;
    private String contraseña;

    /**
     * Obtiene la contraseña del chofer.
     *
     * @return La contraseña del chofer.
     */

    public String getContraseña() {
        return contraseña;
    }


    /**
     * Establece la contraseña del chofer.
     *
     * @param contraseña La nueva contraseña del chofer.
     */


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    /**
     * Obtiene el nombre del chofer.
     *
     * @return El nombre del chofer.
     */

    public String getName() {
        return name;
    }


    /**
     * Establece el nombre del chofer.
     *
     * @param name El nuevo nombre del chofer.
     */

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Obtiene el ID del chofer.
     *
     * @return El ID del chofer.
     */

    public int getID() {
        return ID;
    }


    /**
     * Establece el ID del chofer.
     *
     * @param ID El nuevo ID del chofer.
     */

    public void setID(int ID) {
        this.ID = ID;
    }
}

