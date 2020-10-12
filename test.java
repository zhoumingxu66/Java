package Test;
import CPU.cpu;
import HardDisk.harddisk;
import PC.pc;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cpu cpu = new cpu(2200 , "intel");
		harddisk harddisk = new harddisk(200 ,300);
		pc pc = new pc();
		pc.setCpu(cpu);
		pc.setHarddisk(harddisk);
		pc.show();
	}

}
