package NewCarSystem;

import java.util.ArrayList;

public interface IParams {
	int big=0;
	int medium=0;
	int small=0;
	public void set(int big,int medium,int small);
	ArrayList<Integer>PlanParking=new ArrayList<>();
    // ��ȡ��λ
    public int getBig();
    // ��ȡ�г�λ
    public int getMedium();
    // ��ȡС��λ
    public int getSmall();
    // ��ȡͣ�����У����� [1 2 2 3] ��ʾ ����ͣһ���󳵣��г����г���С��
    public ArrayList<Integer> getPlanParking();
    public void add(int i);
}
