package alibaba4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	/* 请完成下面这个函数，实现题目要求的功能 */
	/* 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
	/****************************** 开始写代码 ******************************/
	static int position(String itemList, String itemPriceList, String itemId,
			double itemPrice) {
          if(itemList.length() != itemPriceList.length()) return -1;
          m.find()
          itemList
          String[] arr1 = itemList.split("\n");
          String[] arr2 = itemPriceList.split("\n");
          for(int i = 0 ; i < arr1.length ;++i){
        	  if(arr1[i].equals(itemId) && Double.parseDouble(arr2[i]) == itemPrice ){
        		  return i;
        	  }
          }
          return -1;
	}

	/****************************** 结束写代码 ******************************/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		String _itemList;
		try {
			_itemList = in.nextLine();
		} catch (Exception e) {
			_itemList = null;
		}

		String _itemPriceList;
		try {
			_itemPriceList = in.nextLine();
		} catch (Exception e) {
			_itemPriceList = null;
		}

		String _itemId;
		try {
			_itemId = in.nextLine();
		} catch (Exception e) {
			_itemId = null;
		}

		double _itemPrice;
		_itemPrice = Double.parseDouble(in.nextLine().trim());

		res = position(_itemList, _itemPriceList, _itemId, _itemPrice);
		System.out.println(String.valueOf(res));

	}
}
