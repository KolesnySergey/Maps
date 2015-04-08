import java.util.LinkedHashMap;
import java.util.Map;

class MyMaps
{
	public static void main(String[] args)
	{
		Map<Integer,String> myMap = new LinkedHashMap<Integer,String>();
		myMap.put(0,"новая строка");
		myMap.put(1,"новая строка #1");
		myMap.put(2,"новая строка #2");
		
		for (Integer key : myMap.keySet()) 
		{
			System.out.println(key + " => " + myMap.get(key));
		}
		
		System.out.println("\nДобавляем строку с имеющимся ключом: ");
		myMap.put(2,"новая строка c новым ключом");
		for (Integer key : myMap.keySet()) 
		{
			System.out.println(key + " => " + myMap.get(key));
		}
		
		System.out.println("\nС пользовательским классом: ");
		Map<MyClass, String> newMap = new LinkedHashMap<MyClass, String>();
		newMap.put(new MyClass("Строка 1"), "q");
		newMap.put(new MyClass("Строка 2"), "w");
		newMap.put(new MyClass("Строка 3"), "e");
		
		for (MyClass key : newMap.keySet()) 
		{
			System.out.println(key.str + " => " + newMap.get(key));
		}
		
		System.out.println("\nДобавляю элемент класса с таким же значение поля: ");
		newMap.put(new MyClass("Строка 3"), "e");
		for (MyClass key : newMap.keySet()) 
		{
			System.out.println(key.str + " => " + newMap.get(key));
		}
	}
}

class MyClass
{
	public String str = "";
	public MyClass(String str)
	{
		this.str = str;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 30;
		return hash * 17;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this.str.equals(((MyClass)obj).str);
	}
	
	
}