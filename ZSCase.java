import java.util.*;
class basic {
	public static void main(String args[]) {
		Hashtable<Integer, Integer> events = new Hashtable<>();
		Hashtable<Integer, Integer> socialMedia = new Hashtable<>();
		Hashtable<Integer, Integer> tv = new Hashtable<>();
		Hashtable<Integer, Integer> Print = new Hashtable<>();
		Hashtable<Integer, Integer> online = new Hashtable<>();
		events.put(10, 5);
		events.put(20, 50);
		events.put(30, 70);
		events.put(40, 80);
		events.put(50, 80);
		events.put(60, 80);
		events.put(70, 80);
		events.put(80, 80); 
		events.put(90, 90); 
		events.put(100, 80);
		socialMedia.put(10, 20);
		socialMedia.put(20, 25);
		socialMedia.put(30, 30);
		socialMedia.put(40, 40);
		socialMedia.put(50, 50);
		socialMedia.put(60, 60);
		socialMedia.put(70, 75);
		socialMedia.put(80, 70); 
		socialMedia.put(90, 65); 
		socialMedia.put(100, 60);
		tv.put(10, 15);
		tv.put(20, 25);
		tv.put(30, 35);
		tv.put(40, 45);
		tv.put(50, 60);
		tv.put(60, 55);
		tv.put(70, 55);
		tv.put(80, 50); 
		tv.put(90, 45); 
		tv.put(100, 45);
		Print.put(10, 10);
		Print.put(20, 15);
		Print.put(30, 20);
		Print.put(40, 35);
		Print.put(50, 45);
		Print.put(60, 65);
		Print.put(70, 68);
		Print.put(80, 70); 
		Print.put(90, 70); 
		Print.put(100, 72);
		online.put(10, 5);
		online.put(20, 8);
		online.put(30, 10);
		online.put(40, 15);
		online.put(50, 15);
		online.put(60, 20);
		online.put(70, 20);
		online.put(80, 25); 
		online.put(90, 30); 
		online.put(100, 35);

		Set<Integer> akeys = events.keySet();
		Set<Integer> bkeys = socialMedia.keySet();
		Set<Integer> ckeys = tv.keySet();
		Set<Integer> dkeys = Print.keySet();
		Set<Integer> ekeys = online.keySet();
		int[] arr = new int[5];

		int max = 0;
		for(int akey : akeys) 
		{
			for(int bkey : bkeys) 
			{
				for(int ckey : ckeys) 
				{
					for(int dkey : dkeys) 
					{
						for(int ekey : ekeys)
						{
							if((akey+bkey+ckey+dkey+ekey) <= 100)
							{
								if((events.get(akey) + socialMedia.get(bkey) + tv.get(ckey) + Print.get(dkey) + online.get(ekey)) > max)
								{
									max = (events.get(akey) + socialMedia.get(bkey) + tv.get(ckey) + Print.get(dkey) + online.get(ekey));
									arr[0] = akey;
									arr[1] = bkey;
									arr[2] = ckey;
									arr[3] = dkey;
									arr[4] = ekey;
								}
							}
						}
					}
				}
			}	
		}
		for(int i : arr) 
		{
			System.out.println(i);
		}
		System.out.println("Maximum Revenue = Rs. " + max + " Million");
	}
}