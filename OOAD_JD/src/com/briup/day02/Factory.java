package com.briup.day02;
/**
 * 工厂接口  抽象工厂模式
 * @author Administrator
 *
 */
public interface Factory {
	/**
	 * 生产水果
	 * @return
	 */
	public Fruit provider();
}
