

import java.util.ArrayList;
import java.util.Scanner;

public class NumberMenu extends Menu {

	public NumberMenu(ArrayList<String> itemList) {
		super(itemList);
		current=3;
	}

	@Override
	public void add() {
		Scanner s=new Scanner(System.in);
		System.out.println("输入要添加的列表值");
		current++;
		itemList.add((current)+"."+s.nextLine());
	}

	@Override
	public void display() {
		for(int i=0;i<itemList.size();i++)
			System.out.println(itemList.get(i));
	}

	@Override
	public void remove() {
		Scanner s=new Scanner(System.in);
		System.out.println("输入要删除的列表项");
		String start=s.nextInt()+"";
		for(int i=0;i<itemList.size();i++)
		{
			if(itemList.get(i).startsWith(start))
				itemList.remove(i);
		}
	}

	@Override
	public void show() {
		System.out.println("数字列表");
	}

}
