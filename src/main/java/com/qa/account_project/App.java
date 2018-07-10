package com.qa.account_project;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.qa.accounts.Accounts;
import com.qa.service.Service;

public class App 
{
    public static void main( String[] args )
    {
    	Service service = new Service();
    	Accounts account1 = new Accounts("Sam", "Kirk", "0001");
    	ObjectMapper mapperObj = new ObjectMapper();
    	
    	service.addAccount(0, account1);
    	
    	try {
            String jsonStr = mapperObj.writeValueAsString(service.getAccount(0));
            System.out.println(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
