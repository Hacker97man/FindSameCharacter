import java.util.Scanner;

public class FindSame {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String same=in.nextLine();
		FindCharSame charSame=new FindCharSame(same);
		Pair<Character, Integer>pair[]=charSame.getSameChar();
		for(int i=0;i<256;i++)
			if(pair[i].second>1)
				System.out.println(pair[i].first +" : "+pair[i].second);
	}
	
	private static class Pair<T,V>{

		private T first;
		private V second;
		
		public Pair(T first,V second){
			this.first=first;
			this.second=second;
		}
	}
	public static class FindCharSame{
		private int[]ar;
		private char[]charar;
		private Pair<Character, Integer>pair[];
		public FindCharSame(String same) {
			pair=new Pair[256];
				for(int i=0;i<256;i++)
					pair[i]=new Pair<Character,Integer>((char)i,0);
				charar=same.toCharArray();
				ar=new int[256];
		}
			
			public Pair<Character, Integer>[]getSameChar(){
				
				for(int i=0;i<charar.length;i++)
					pair[charar[i]].second++;
				return pair;
			}
	}

}
