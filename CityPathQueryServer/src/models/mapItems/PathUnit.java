package models.mapItems;

import java.util.ArrayList;

import models.query.Advice;

/**
 * ��������һ��ֱ�ߵ�·���߼����ǵ�ͼ��·����С��λ
 * @author ������
 *
 */
public class PathUnit {
	
	private int ID;
	private Coordinate startPoint;
	private Coordinate endPoint;
	private int scoredTimes; //�ܵ��Ĵ�ִ���
	private double averageScore;//ƽ������
	private ArrayList<Advice> advices; //�õ�����������
	
	
	/**
	 * 
	 * @return ����·������
	 */
	double getDistance() {
		double distance = -1;
		
		//ͨ��������յ�������
		
		return distance;
	}
	
	
}
