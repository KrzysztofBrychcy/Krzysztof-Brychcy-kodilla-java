package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnection() throws SQLException {
        //Give
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Give
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " + rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5,counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Give
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER \n" +
                "FROM POSTS P, USERS U \n" +
                "WHERE U.ID = P.USER_ID \n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*)>=2\n" +
                "ORDER BY U.LASTNAME, U.FIRSTNAME;\n";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FirstName") + ",\t " + rs.getString("LastName") + ",\t " + rs.getInt("Posts_Number"));
            counter ++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2,counter);
    }
}
