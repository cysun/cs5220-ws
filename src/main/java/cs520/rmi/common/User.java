package cs520.rmi.common;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    String username;

    String password;

    String firstName;

    String lastName;

    Integer age;

    public User( String username, String password, String firstName,
        String lastName, Integer age )
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + ", Age " + age;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge( Integer age )
    {
        this.age = age;
    }

}
