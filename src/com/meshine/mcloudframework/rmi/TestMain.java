package com.meshine.mcloudframework.rmi;

import java.io.IOException;

import lipermi.exception.LipeRMIException;
import lipermi.handler.CallHandler;
import lipermi.net.Client;

/**
 * RMIServer main method
 * 
 * @author Li
 * 
 */
public class TestMain {

	public static void main(String[] args) throws IOException, LipeRMIException {
		CallHandler callHandler = new CallHandler();
		
		String address = "127.0.0.1";
		int port = 6666;
		Client client = new Client(address,port,callHandler);
		System.out.println("Client success");
		Compute remoteObject = (Compute) client.getGlobal(Compute.class);
		System.out.println("Get global success");
		String result = remoteObject.getPI(999);
		System.out.println(remoteObject.add(1,2));
		System.out.println("Result is :"+result);
	}
}
