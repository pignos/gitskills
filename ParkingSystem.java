package NewCarSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class ParkingSystem implements IParking{
	int big,medium,small;
	static StringBuffer text=new StringBuffer("[null");	
	public void print() {
		System.out.println(text);
		}
    public boolean addCar(int carType) {
    	int a=carType;
    	switch(a) {
    	case 1:{if(big>0) {
    		big--;
    	}else {
    		return false;
    		}
    		break;
    		}
    	case 2:{
    		if(medium>0) {
    		medium--;
    	}else {
    		return false;
    		}
    		break;
    		}
    	case 3:{if(small>0) {
    		small--;
    	}else {
    		return false;
    		}
    		break;
    		}
    	}
      	return true;
    	}
public static void main(String[] args) throws Exception {
	System.out.println("«Î ‰»Î");
        IParams params = IParking.parse();//ParkingSystem.parse();
        ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params.getPlanParking();
        for (Integer integer :plan) {
           if( ps.addCar(integer)) {
        	   text.append(",true");
           }else 
           { text.append(",false");
           }
        }
        text.append("]");
        ps.print();
        }
public ParkingSystem (int big, int medium, int small) {
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
    }//456