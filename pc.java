package PC;
import CPU.cpu;
import HardDisk.harddisk;
public class pc {
	public float weight;
	public int size;
	cpu c;
	harddisk h;
	public pc(){
		
	}
	public pc(float weight , int size){
		this.weight=weight;
		this.size=size;
	}
	public void setCpu(cpu c){
		this.c = c;
	}
	public void setHarddisk(harddisk h){
		this.h=h;
	}
	public void show(){
		System.out.println("pc��cpu�ٶ�Ϊ��"+c.getSpeed());
		System.out.println("pc��amount������Ϊ��"+h.getAmount());
	}
	}


