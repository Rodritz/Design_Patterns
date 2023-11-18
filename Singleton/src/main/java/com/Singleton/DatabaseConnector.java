package com.Singleton;

public class DatabaseConnector {
    private static DatabaseConnector databaseConnectorInstance;

    private DatabaseConnector(){
        System.out.println("Creating object");
    }

    public static DatabaseConnector getInstance(){

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
