package org.example;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main(String[] args) {
        String connectionString = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("Comida");

            // Metodos aca

        } catch (Exception e) {
            System.err.println("Error al conectar o interactuar con MongoDB: " + e.getMessage());
        }
    }
}