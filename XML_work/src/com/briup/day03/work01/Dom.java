package com.briup.day03.work01;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;




import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * Dom解析xml文件
 * 
 * @author Hyouka
 *
 */
public class Dom {
	public List<User> parser(String fileName) throws Exception{
		List<User> list = new ArrayList<User>();
		
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setNamespaceAware(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 获得Document对象,这个对象可以表示一个文档,例如一个xml文档
			Document document = builder
					.parse("src/com/briup/day03/work01/user.xml");
			// 获取根元素
			Element element = document.getDocumentElement();
			// 获得根元素下面的所有子元素
			NodeList childNodes = element.getChildNodes();

			User u = null;
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node node = childNodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					u = new User();
					//获取用户信息
					getUserInfo(node, u);
					//NodeList userChildNodes = node.getChildNodes();
				}
				list.add(u);
			}
			
		
		return list;

	}
	private void getUserInfo(Node node,User user){
		if(node.getNodeType()==Node.ELEMENT_NODE){
			if("user".equals(node.getChildNodes())){
				String name=node.getAttributes().getNamedItem("name").getNodeValue();
				user.setName(name);
			}
		}
		
	}
	public static void main(String[] args) {
		Dom dom = new Dom();
		try {
			List<User> list = dom.parser("src/com/briup/day03/work01/user.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
