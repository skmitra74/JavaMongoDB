package javamongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author shekhar.kumar.mitra
 */
public class JavaMongoDB {

    public static void main(String[] args) throws Exception
    {
      Mongo mongo = new Mongo("localhost", 27017);
      DB testDb = mongo.getDB("test");
      DBCollection table = testDb.getCollection("test");
      
      /*Set<String> tables = testDb.getCollectionNames();
 
	for(String coll : tables){
		System.out.println(coll);
	} */
      
      /*List<String> dbs = mongo.getDatabaseNames();
      
      for(String db : dbs){
		System.out.println(db);
	} */
      
      BasicDBObject searchQuery = new BasicDBObject();
      //searchQuery.put("a", 1);
      
      DBCursor cursor = table.find(searchQuery);
 
      while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
      
      //searchQuery.put("d", 4);
     // table.remove(searchQuery);
      
      BasicDBObject document = new BasicDBObject();
      document.put("name", "mkyong");
      document.put("age", 30);
      document.put("createdDate", new Date());
      
      table.insert(document);
    }
}
