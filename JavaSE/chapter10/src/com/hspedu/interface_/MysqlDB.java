package com.hspedu.interface_;

public class MysqlDB implements DBInterface {
	@Override
	public void connect() {
		System.out.println("连接 mysql...");
	}
	@Override
	public void close() {
		System.out.println("关闭 mysql...");
	}
}
