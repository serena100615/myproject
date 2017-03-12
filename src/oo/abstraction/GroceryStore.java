package oo.abstraction;

public class GroceryStore {
	String name;    //商品名稱
	  int number ;  //數量
	  int in ;      //進價
	  int price;    //售價
	  int year;     //有效日期:年
	  int month;    //有效日期:月
	  int day;      //有效日期:日
	  public GroceryStore(String name,int number,int in,int price,int year, int month,int day){
		 this.name=name;
		 this.number=number;
		 this.in=in;
		 this.price=price;
		 this.year=year;
		 this.month=month;
		 this.day=day;
	  }
}
