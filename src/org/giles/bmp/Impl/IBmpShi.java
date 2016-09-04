package org.giles.bmp.Impl;

import java.util.List;

import org.giles.bmp.Ibmp.IBmp;
import org.giles.bmp.entity.Book;

public class IBmpShi implements IBmp {
	//静态数组
	public static Book[] books = new Book[30];
	//static代码块会进行初始化，在创建对象时
	static{
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book book5 = new Book();
		book1.setId(10001);
		book1.setBookName("鬼吹灯");
		book1.setAuthor("天下霸唱");
		book1.setTime("2008-7-1");
		book1.setPrice(27.80);
		book1.setStore(87);

		book2.setId(10002);
		book2.setBookName("魔戒1");
		book2.setAuthor("莫尔斯");
		book2.setTime("2005-3-14");
		book2.setPrice(54.00);
		book2.setStore(13);

		book3.setId(10003);
		book3.setBookName("哈利波特1");
		book3.setAuthor("罗琳");
		book3.setTime("2003-2-14");
		book3.setPrice(43.50);
		book3.setStore(99);

		book4.setId(10004);
		book4.setBookName("时间机器");
		book4.setAuthor("威尔");
		book4.setTime("1965-3-3");
		book4.setPrice(21.30);
		book4.setStore(75);

		book5.setId(10005);
		book5.setBookName("宇宙奥秘");
		book5.setAuthor("霍金");
		book5.setTime("2003-12-23");
		book5.setPrice(87.30);
		book5.setStore(14);

		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;
		books[4] = book5;
	}

	@Override
	public boolean doStore(int id,int store) {
		for(int i=0;i<books.length;i++){
			if(books[i].getId()==id){
				books[i].setStore(books[i].getStore()+store);
				return true;
			}	
		}
		return false;
	}
	
	@Override
	public boolean buStore(int id,int store) {
		
		for(int i=0;i<books.length;i++){
			if(books[i]!=null&&books[i].getId()==id){
				books[i].setStore(books[i].getStore()-store);
				return true;
			}	
		}
		return false;
	}
	/**
	 * 因为使用数组存数Book的所以增加的数量有限，30
	 */
	@Override
	public void addBook(Book book) {
		int i=0;
		for(i=0;i<books.length;i++){
			if(books[i]==null){
				break;
			}
		}
		books[i]=book;
		books[i].setId(books[i-1].getId()+1);
	}

	public Book[] queryAllStore() {
		return books;
	}

}
