package com.briup.ooad.day03.work03;

public class UserProxy implements User {
	private User user;

	public UserProxy(User user) {
		this.user = user;
	}

	@Override
	public void showUserInfo() {
		String classname = user.getClass().toString();
		int index = classname.lastIndexOf(".");
		classname = classname.substring(index + 1);
		if (classname.equals("Admin")) {
			System.out.println("欢迎管理员");
			user.showUserInfo();
		}
		if (classname.equals("VipUser")) {
			System.out.println("欢迎会员");
			user.showUserInfo();
		}
		if (classname.equals("Vistor")) {
			System.out.println("欢迎游客");
			user.showUserInfo();
		}
	}

}
