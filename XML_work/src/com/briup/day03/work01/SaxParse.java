package com.briup.day03.work01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 使用Sax解析XML文件
 * 
 * @author Hyouka
 *
 */
public class SaxParse {
	private List<User> users;
	private User user;

	public List<User> read(String filePath) {
		users = new ArrayList<User>();

		try {
			// 第一步：获取sax解析工厂对象
			SAXParserFactory factory = SAXParserFactory.newInstance();
			// 第二步：获取sax解析器对象
			SAXParser parser = factory.newSAXParser();
			// 第三步：利用parser解析器对象解析xml文件
			parser.parse(filePath, new DefaultHandler() {
				String cuurentQname;

				@Override
				public void characters(char[] ch, int start, int length)
						throws SAXException {
					//System.out.println("获取元素内容");
					String text = new String(ch, start, length);
					if ("user".equals(cuurentQname)) {
						
						user.setAccount(Double.parseDouble(text));;
					}
				}

				@Override
				public void endDocument() throws SAXException {
					//System.out.println("文档结束解析");
				}

				@Override
				public void endElement(String uri, String localName,
						String qName) throws SAXException {
					//System.out.println("元素结束解析");
					if (qName.equals("user")) {
						users.add(user);
					}
					this.cuurentQname = null;
				}

				@Override
				public void startDocument() throws SAXException {
					//System.out.println("文档开始解析");
				}

				@Override
				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					//System.out.println("元素开始解析");
					this.cuurentQname = qName;
					if (qName.equals("user")) {
						user = new User();
						String name = attributes.getValue("name");
						user.setName(name);
					}
				}

			});
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;

	}

	public static void main(String[] args) {
		List<User> user = new SaxParse()
				.read("src/com/briup/day03/work01/user.xml");
		System.out.println(user.toString());
	}
}
