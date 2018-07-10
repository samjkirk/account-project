package com.qa.account_project;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.qa.accounts.Accounts;
import com.qa.service.Service;
import com.thoughtworks.xstream.XStream;

public class App 
{
    public static void main( String[] args )
    {
    	Service service = new Service();
    	Accounts account1 = new Accounts("Sam", "Kirk", 1001);
    	ObjectMapper mapperObj = new ObjectMapper();
    	XStream xstream = new XStream();
    	
    	service.addAccount(account1.getAccountNumber(), account1);
    	
    	try {
            String jsonStr = mapperObj.writeValueAsString(service.getAccount(account1.getAccountNumber()));
            System.out.println(jsonStr + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    	String xmlString = xstream.toXML(service.getAccount(account1.getAccountNumber()));
    	System.out.println(xmlString + "\n");

    }
}
