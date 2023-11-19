package com.Singleton;

/**
 *  Rules para implementar un Singleton
 *  1) Debemos tener un constructor privado / de esta manera restringimos la creacion de un mismo objeto desde fuera de esta clase
 *  2) Debemos tener un atributo privado estatico / We need to have a static private attribute
 *  3) Debemos tener un metodo estatico de devuelva la instancia / We need to have a public static method wich returns the instance
 */

public class DatabaseConnector {

    /*2) Debemos tener un atributo privado estatico*/
    private static DatabaseConnector databaseConnectorInstance;

    /*1) Debemos tener un constructor privado*/
    private DatabaseConnector(){
        System.out.println("Creating object");
    }

    /*3) Debemos tener un metodo estatico de devuelva la instancia*/

    /*si manejamos apps multihilos debemos asegurarnos que utilicen el mismo Singleton, asi que
    * agregamos el Synchronized. De esta manera java se encarga de que los hilos sepan que solo uno a la
    * vez puede invocar el Singleton*/
    public static synchronized DatabaseConnector getInstance(){

        if(databaseConnectorInstance == null){
            databaseConnectorInstance = new DatabaseConnector();
        }
        return databaseConnectorInstance;
    }

    public void connectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }

        System.out.println("Connecting to Database " + databaseConnectorInstance);
    }

    public void disconnectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }

        System.out.println("Disconnecting to Database " + databaseConnectorInstance);
    }
}
