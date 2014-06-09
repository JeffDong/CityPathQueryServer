package models.user;

import java.util.ArrayList;

import models.mapItems.Path;
import models.query.Advice;
import models.query.Query;

/**
 * ������
 * @author ������
 *
 */
public class RegisteredUser extends User{
	private UserInfo userInfo;
	private ArrayList<Query> queryHistory;
	private ArrayList<Advice> adviceHistory;
	

	/**
	 *
	 */
	public RegisteredUser(UserInfo userInfo, ArrayList<Query> queryHistory, ArrayList<Advice> adviceHistory) {
		this.userInfo = userInfo;
		this.queryHistory = queryHistory;
		this.adviceHistory = adviceHistory;
	}
	
	/**
	 * ���û�ȷ�Ϸ�������ʱ�����ã���������ύ����������������������Ӧ�ɹ�<br>
	 * ��������������µ�������ʷ�����±�����ʷ
	 * @param advice
	 * @return ���ؽ���ɹ�/ʧ��
	 */
	boolean addAdvie (Advice advice) {
		boolean result = false;
		
		
		return result;
	}
	

	/**
	 * ���û�Ϊĳһ�����۵���ʱ���ã�����������͵������۵�����
	 * @param AdviceID
	 * @return ���ؽ���ɹ�/ʧ��
	 */
	boolean likeAdvice (int AdviceID) {
		boolean result = false;
		
		
		return result;
	}
	
	
	/**
	 * ���û�Ϊ·�����ʱ�����ã������������·���������
	 * @param path
	 * @param score
	 * @return
	 */
	boolean scorePath (Path path,int score){
		boolean result = false;
		
		
		return result;
	}
	
	/**
	 * ���û��޸��û���Ϣʱ���ã�������������޸��û���Ϣ����
	 * @param userInfo
	 * @return
	 */
	boolean changeUserInfo (UserInfo userInfo){
		boolean result = false;
		
		
		return result;
	}

	
	/**
	 * ɾ�����ۣ���Ҫ������۵ķ������Ƿ�Ϊ�Լ������������������ɾ����������
	 * @param advice
	 * @return
	 */
	boolean deleteAdvice (Advice advice){
		boolean result = false;
		
		
		return result;
	}
	
	
	/**
	 * �޸����ۣ���Ҫ������۵ķ������Ƿ�Ϊ�Լ�������������������޸���������
	 * @param advice
	 * @return
	 */
	boolean changeAdvice (Advice advice){
		boolean result = false;
		
		
		return result;
	}
	
	
	/**
	 * �ǳ�
	 * @return
	 */
	boolean logout() {
		boolean result = false;
		
		
		return result;
	}
	
	//getter and setter
	int getID () {
		return userInfo.getID();
	}
	
	//auto getter and setter
}
