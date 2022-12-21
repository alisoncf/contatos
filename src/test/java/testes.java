

import dao.ConnectionFactory;
import dao.UserDao;
import java.time.Instant;
import java.util.Date;
import model.User;
import org.junit.Test;

public class testes {
    @Test
    public void quotes(){
        System.out.println(util.Util.ToSimpleQuotes("teste", ","));
        System.out.println(util.Util.ToDoubleQuotes("teste", ""));

    }
   
    
    @Test
    public void testAddUser(){
        User user = new User();
        user.setEmail("alison@gmail.com");
        user.setExpire(Date.from(Instant.now()) );
        user.setName("alison");
        user.setPassword("xxxxxx");
        user.setToken("tttttttt");
        
        UserDao dao = new UserDao();
        dao.insert(user);
        
        
    
    }
    @Test
    public void testConn(){
        ConnectionFactory fac = new ConnectionFactory();
        
        
    }
    
    
}
