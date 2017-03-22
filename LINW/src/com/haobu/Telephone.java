package com.haobu;

public class Telephone {
	int price;
	double cpu;
	int mem;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (mem != other.mem)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	public void Outer(){
		System.out.println("价格："+price+"处理器频率："+cpu+"内存："+mem);
	}

}
