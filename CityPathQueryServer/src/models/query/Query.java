package models.query;

import java.util.Date;

import models.mapItems.Coordinate;
import models.mapItems.Path;

/**
 * ������
 * @author ������
 *
 */
public class Query {
	private int ID;
	private int userID;
	private Coordinate startPoint;
	private Coordinate endPoint;
	private Date queryTime; //��ѯʱ��
	
	private double scoreLimit;	//��ѯ·���������ƣ�ȡֵΪ0��5
	private double distanceLimit;//��ѯ·����󳤶����ƣ�ȡֵΪ��
	
	private Path resultPath; //���ղ�ѯ���
	
	
}
