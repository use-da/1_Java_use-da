package edu.kh.network.server.model.service;

public class ServerService {

	//TCP Socket프로그래밍
	//TCP
	//-서버, 클라이언트 간의 1:1소켓 통신(연결 지향적 프로토콜)
	//-서버가 먼저 실행되어 있는 상태에서 클라이언트가 연결해야함
	//-데이터 전송 순서가 보장되고, 수신 여부를 판단하여 오류(손실) 발생 시 재전송함
	//
	//java.net패키지에서 제공하는 Socket,ServerSocket클래스를 사용해야한다
	//
	//Socket : 프로세스의 양 끝단(프로세스 간의 통신을 담당)
	//		   Input/OutputStream을 보유하고 있음	
	//ServerSocket : 포트와 연결되어 외부 요청을 기다리는 객체
	//				 클라이언트의 연결 요청이 들어오면 클라이언트의 소켓을 얻어와 연결한다
	//				 하나의 포트에는 하나의 ServerSocket만 연결가능
	public void serverStart() {
		
		
		
		
		
		
	}

}
