package org.giles.bmp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.giles.bmp.Impl.IBmpShi;
import org.giles.bmp.entity.Book;

public class Menu {
	static IBmpShi is=new IBmpShi();//static会进行加载
	 static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		
		String role;
		Menu menu=new Menu();
		System.out.println("欢迎来到水木书店");
		while(true){
		System.out.println("请输入用户名:");
		String username=input.next();
		System.out.println("请输入密码:");
		String password=input.next();
		//根据用户名和密码来判断是消费者还是库存管理员，或者什么都不是
		//可以通过创建一个类进行判断，根据返回值进行角色认定
		//暂时先通过if...else...进行判断
		if(username.equals("admin")&&password.equals("admin")){
			role="storeMan";
			System.out.println("登陆成功");
			System.out.println("欢迎来到水木图书库存管理系统");
			while(true){
			menu.roleDo(role);
			}
		}else if(username.equals("wangqiang")&&password.equals("wangqiang")){
			role="customer";
			System.out.println("登陆成功");
			System.out.println("欢迎光临水木图书消费系统");
		}else{
			System.out.println("输入有误，请重新登陆");
			continue;
		}
		
		}	
	}
	public void roleDo(String role){
		System.out.println("请选择所要进行的操作：1.图书入库  2.图书出库  3.查询全部图书  4.新增图书");
		int choice=input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("请输入图书编号：");
			int id=input.nextInt();
			System.out.println("请输入入库数量：");
			int store=input.nextInt();
			boolean flag=is.doStore(id, store);//入库
			if(flag){
				System.out.println("入库成功！");
			}else{
				System.out.println("输入编号不存在！");
			}
			break;
		case 2:
			System.out.println("请输入图书编号：");
			int id2=input.nextInt();
			System.out.println("请输入出库数量：");
			int store2=input.nextInt();
			boolean flag2=is.buStore(id2, store2);
			if(flag2){
				System.out.println("出库成功！");
			}else{
				System.out.println("输入编号不存在！");
			}
			break;
		case 3:
			Book[] books= new Book[30];
			books=is.queryAllStore();
			System.out.println("书号\t\t书名\t\t作者\t\t发布日期\t\t价格\t库存");
			for(Book book:books){
				if(book!=null){
					System.out.println(book);
				}
			}
			break;
		case 4:
			int id4=0;
			System.out.println("请输入图书名称:");
			String bookName=input.next();
			System.out.println("请输入图书作者:");
			String author=input.next();
			System.out.println("请输入图书出版日期：");
			String time=input.next();
			System.out.println("请输入图书价格：");
			double price=input.nextDouble();
			System.out.println("请输入图书库存量:");
			int store4=input.nextInt();
			Book books5=new Book(id4, bookName, author, time, price, store4);
			is.addBook(books5);
			break;
			
		default:
			break;
		}
		
	}

}
