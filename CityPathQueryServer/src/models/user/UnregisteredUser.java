package models.user;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import models.connection.*;
import models.query.*;
import models.mapItems.*;

/**
 * ������δע���û��ֻ࣬�ܽ���ע�ᣬ��¼����ѯ����
 * @author ������
 *
 */
public class UnregisteredUser extends User{
	Connection connection;
	
	public UnregisteredUser(Connection connection) {
		this.connection = connection;
	}
	
	/**
	 * ���������������ύע������
	 * @param registerInfo
	 * @return ע�����ɹ�/ʧ��
	 */
//	public boolean register(UserInfo registerInfo) {
//		
//		connection.sendRegisterReq(registerInfo);
//		
//		Boolean b = (Boolean) connection.recvObjectFromServer(Boolean.class);
//		
//		return b;
//	}
//		
//	
//	/**
//	 * ���������������ύ��¼����
//	 * @param name
//	 * @param password
//	 * @return ��¼���
//	 */
//	public RegisteredUser login(String name,String password){
//		
//		connection.sendLoginReq(name, password);
//		
//		//�ӷ�������ȡ������ʷ�Ͳ�ѯ��ʷ
//		UserInfo userInfo = (UserInfo) connection.recvObjectFromServer(UserInfo.class);
//		ArrayList<Query> queryHistory = (ArrayList<Query>) connection.recvObjectFromServer(ArrayList.class);
//		ArrayList<Advice> adviceHistory = (ArrayList<Advice>) connection.recvObjectFromServer(ArrayList.class);;
//		RegisteredUser newUser = new RegisteredUser(userInfo, queryHistory, adviceHistory);
//		
//		return newUser;
//	}

}
