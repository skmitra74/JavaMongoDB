package javamongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.BSONObject;


/**
 *
 * @author shekhar.kumar.mitra
 */
class Tweet implements DBObject
{

    @Override
    public void markAsPartialObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isPartialObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.       
    }

    @Override
    public Object put(String string, Object o) {
        //put(string,o);
    }

    @Override
    public void putAll(BSONObject bsono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map toMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object removeField(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsKey(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsField(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

public class JavaMongoDB3 {

    public static void main(String[] args) throws Exception
    {
      Mongo mongo = new Mongo("localhost", 27017);
      DB testDb = mongo.getDB("myanotherdb");
      DBCollection table = testDb.getCollection("tweet");
      
      Tweet myTweet = new Tweet();
      myTweet.put("user", "skmitra");
      myTweet.put("message", "Hello!");
      myTweet.put("date", new Date());

      table.insert(myTweet);
      
           
    
    }
}
