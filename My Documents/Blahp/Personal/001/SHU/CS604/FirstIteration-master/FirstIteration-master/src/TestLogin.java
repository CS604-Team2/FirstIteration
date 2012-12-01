package de.vogella.junit.first;
 
import java.util.ArrayList;
import java.util.List;
 
public class TestLogin
{
  public boolean isValidUsername(String username)
  {
    List<aUser> users = getUsersStoredInSystem();
 
    // this is called a 'for each' loop, it's
    // similar to a regular for loop, except that
    // it's easier to write, since you don't need
    // to specify an index to start at and end at.
    // it will just loop through all of the items
    // in the 'users' list.
    for (aUser aUser : users)
    {
      if (username.equals(aUser.getUsername()))
      {
        return true;
      }
    }
    return false;
  }
 
  public boolean isValidUsernameAndPassword (String username, String password)
  {
    List<aUser> users = getUsersStoredInSystem();
 
    for (aUser aUser : users)
    {
      if (username.equals(aUser.getUsername()) 
    		  && password.equals(aUser.getPassword()))
      {
        return true;
      }
    }
 
    return false;
  }
 
  public List<aUser> getUsersStoredInSystem ()
  {
    List<aUser> userList = new ArrayList<aUser>();
 
    // create a list of 10 users, each with user names
    // that increment (ie. user1, user2, user3, user4),
    // all these users will have the password set to
    // 'howtoprogramwithjava'
    for (int i=0; i<10; i++)
    {
      userList.add(new aUser("user"+i, "howtoprogramwithjava"));
    }
 
    return userList;
  }
}