package NewCarSystem;

import java.util.ArrayList;
import java.util.Scanner;

interface IParking {
    // ��ӡ������
    public void print();
    // ����Ƿ��� carType ��Ӧ��ͣ��λ
    // ���û�пճ�λ���뷵�� false �����򽫸ó�ͣ�복λ������ true
    public boolean addCar(int carType);
   public static IParams parse() throws Exception{
	IParams P=new IParams() {
		int big =0;
		int medium=0;
		int small=0; 
		 ArrayList<Integer> PlanParking=new ArrayList<>();
		   public int getBig() {
			 return big;
			 };
		    public int getMedium() {
		    	return medium;
		    };
		 
		    public int getSmall() {
		    	return small;
		    };
		    public void set(int big,int medium,int small) {
		    	this.big=big;
				this.medium=medium;
				this.small=small;
		    }
		    public void add(int i) {
		    	PlanParking.add(i);
		    }
		   public ArrayList<Integer> getPlanParking(){
			   return PlanParking;
		   }
	};
	int x=0,sum=0;
	Scanner sc= new Scanner (System.in);
	String init_code=sc.nextLine(),add_code,car_num,add_num,temp;
	while ((x=init_code.indexOf("addCar",x))!=-1) {
		sum++;
		x=x+6;
	}
	add_code=sc.nextLine();
	car_num=add_code.substring(2, add_code.indexOf("]",2));
	car_num=car_num+",";
	x=0;
	int[] num=new int [3];
	for(int i=0;i<3;i++) {
		temp=car_num.substring(x, car_num.indexOf(",",x)).trim();
		x=car_num.indexOf(",",x)+1;
		num[i]=Integer.parseInt(temp);
	}
	P.set(num[0],num[1],num[2]);
	add_num=add_code.substring(add_code.indexOf("]",2)+1, add_code.length()-1);
	x=0;int j=0;
	for(int i=0;i<add_num.length();i++) {
		if(add_num.charAt(i)>='1'&&add_num.charAt(i)<='3') {
			j++;
			P.add(add_num.charAt(i)-48);
		}
	}if(j!=sum) {
		System.err.println("����������");
	}	
	sc.close();
	return P;
 };
}
