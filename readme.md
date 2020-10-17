# 计G201 2020322057 周洺旭  
JAVA课程作业项目库  
#阅读程序 p110：  
用类描述计算机中cpu的速度和硬盘容量.要求JAVA应用程序有四个类，名字分别是PC、CPU、硬盘和测试，其中测试是主类。其中，cpu类要求类要求返回的值，要求setSpeer(INT M)方法将参数m的值赋给的值赋给速度：HardDisk类要求getAmount()返回A工程量的值，要求setA装入(INT M)的方法将参数m的值赋给Aantity；PC类要求setCPU(Cpu C)J将参数C的值赋给cpu，要求setHardDisk(HardDisk)方法将参数h的值赋给HD，要求Showing()的值赋给CPUp。
主类测试的要求
主方法中创建一个cpu对象cpu，cpu将自己的速度设置为2200。
主方法中创建一个硬盘对象磁盘，磁盘将自己的金额设置为200
PC调用设置cpu(Cpu C)方法，调用时实参是cpu
PC调用setHardDisk(硬盘)方法，调用时实参是磁盘。
PC调用Show()方法  
！[image]（https://github.com/zhoumingxu66/Java/blob/main/微信图片_20201015224803.jpg）  
## 实验目的  
在本次实验中学会定义构造方法，熟练操作Java中类、方法和类。    

## 实验过程  
首先创建四个包并且在每个包中建立四个类分别为pc、cpu、harddisk、test。  
pc中定义调用cpu包中的cpu类和HardDisk包中的HardDisk类利用this关键字引用speed和amount的成员变量  
重点：定义一个空的默认的pc构造方法保证下面的构造方法能够正常被调用。
```
public PC() {
		
	}
public void setCPU(CPU c) {
		this.c=c;
	}
	public void setHardDisk(HardDisk h) {
		this.h=h;
	}
``` 
应题意要求给每个类中使用两个构造方法所以在这个实验中定义了pc的重量（weight）和型号（size）  
```
public class PC{
		public float weight;
		public int size;
		CPU c;
		HardDisk h;
	public PC() {
		
	}
	public	PC(float weight , int size) {
		this.weight=weight;
		this.size=size;
	}
```  
cpu和harddisk编写方法相同，cpu中定义了cpu的speed和brand两个构造方法、harddisk中定义了amount和total两个构造方法  
```
public class CPU {
		private int speed;
		public String brand;
		
		public CPU(int speed, String brand) {
			this.speed = speed;
			this.brand = brand;	
		}
		
		public CPU(String brand) {
			this.speed = 2200;
			this.brand = brand;
		}
		
		public int getSpeed() {
			return this.speed;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
	
	}
```
以上出示了cpu的编写代码harddisk与其基本相同。在包文件下利用import关键字调用pc类中，harddisk相同。  
test类文件中利用import关键字调用三个类文件名  
``` 
import HardDisk.HardDisk;
import PC.PC;
import CPU.CPU;
``` 
将cpu的速度和harddisk的容量进行实例化好进行调用  
```
public void setCPU(CPU c) {
		this.c=c;
	}
	public void setHardDisk(HardDisk h) {
		this.h=h;
``` 
调用方式  
```
CPU cpu = new CPU(2200, "Intel");
		HardDisk harddisk = new HardDisk(200, 500);
		PC pc = new PC();
```
最后利用show方法输出结果  
``` 
pc.setCPU(cpu);
		pc.setHardDisk(harddisk);
		pc.show();
```
## 核心方法  
1、方法一：利用了构造方法  
2、方法二：利用import调用类方法  
3、方法三：使用show（）方法  
##实验结果  
  
```
pc的cpu速度为2200
pc的amount的容量为200
```
## 实验感想  
本次实验学习了怎么利用类，对象和方法。如何调用不同包下的类文件。this，import show等关键字的使用方法。最重要的是空的构造方法的作用如，public class pc{}
出现在本次实验中。
