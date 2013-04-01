package javamongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author shekhar.kumar.mitra
 */
public class JavaMongoDB2 {

    public static void main(String[] args) throws Exception
    {
      Mongo mongo = new Mongo("localhost", 27017);
      DB testDb = mongo.getDB("mydb");
      DBCollection table = testDb.getCollection("mycollection");
      DBCollection table2 = testDb.getCollection("expenses");
           
     //INSERT - ONCE
      /*BasicDBObject doc = new BasicDBObject("name", "MongoDB").
                              append("type", "database").
                              append("count", 1).
                              append("info", new BasicDBObject("x", 203).append("y", 102));

      table.insert(doc); */
      
      //INSERT MULTIPLE
      
      /*for (int i=0; i < 100; i++) {
        table.insert(new BasicDBObject("i", i));
       }*/
      
      //RETRIEVE FIRST
      /*DBObject myDoc = table.findOne();
      System.out.println(myDoc);*/
      
     /*try (DBCursor cursor = table.find()) {
        while(cursor.hasNext()) {
            System.out.println(cursor.next());
        }
     } */
     
      /*BasicDBObject query = new BasicDBObject("i", new BasicDBObject("$gt", 50));
      
        try (DBCursor cursor = table.find(query)){
           while(cursor.hasNext()) {
               System.out.println(cursor.next());
           }
        }*/
      
      
      
      
    }
}
