package VortexDimensionClub;
import com.mongodb.client.*;
import org.bson.Document;

public class quickStart {
    public static void main( String[] args ) {
        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://Portu2965:Kalibrad0s2965@m6dam.ztuhe.mongodb.net";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Vortex");
            MongoCollection<Document> collection = database.getCollection("DimensionClub");

            FindIterable<Document> notes = collection.find();
            for (Document note : notes) {
                System.out.println(note.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error al connectar o operar amb la base de dades: " + e.getMessage());
        }
    }
}
