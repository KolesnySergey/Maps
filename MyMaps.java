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
		Map<Integer,MyClass> newMap = new LinkedHashMap<Integer,MyClass>();
		newMap.put(0, new MyClass("Строка 1"));
		newMap.put(1, new MyClass("Строка 2"));
		newMap.put(2, new MyClass("Строка 3"));
		
		for (Integer key : newMap.keySet()) 
		{
			System.out.println(key + " => " + newMap.get(key).str);
		}
		
		System.out.println("\nДобавляю элемент класса с таким же значение поля: ");
		newMap.put(2, new MyClass("Строка 3"));
		for (Integer key : newMap.keySet()) 
		{
			System.out.println(key + " => " + newMap.get(key).str);
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
	
	
}