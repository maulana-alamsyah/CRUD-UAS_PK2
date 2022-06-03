/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author LENOVO
 */
public class Connect {
    
    public static MongoDatabase connectDB() {
        try {
            String uri = "mongodb://localhost:27017";
            MongoClient client = MongoClients.create(uri);
            MongoDatabase database = client.getDatabase("toko_buku");
            System.out.println("Database Connected!");
            return database;
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
        
        return null;
    }
}
