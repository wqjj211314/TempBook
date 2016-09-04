package org.giles.bmp.Ibmp;


import org.giles.bmp.entity.Book;

public interface IBmp {
	public boolean doStore(int id,int store);
	public boolean buStore(int id,int store);
	public void addBook(Book book);
	public Book[] queryAllStore();

}
