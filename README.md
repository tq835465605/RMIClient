RMI(Remote Method Invocation)客户端
同步服务端的接口，也可以将接口定义为通用客户与服务端都引用即可。
这里定义了一个Compute接口，客户端可以不用实现他，

      CallHandler callHandler = new CallHandler();
		
		String address = "127.0.0.1";
		int port = 6666;
		Client client = new Client(address,port,callHandler);
		System.out.println("Client success");
		Compute remoteObject = (Compute)        client.getGlobal(Compute.class);
		System.out.println("Get global success");
		String result = remoteObject.getPI(999);
		System.out.println(remoteObject.add(1,2));
		System.out.println("Result is :"+result);