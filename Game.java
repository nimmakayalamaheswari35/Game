 import java.util.Scanner;
class Game1
{
	
	Game1()
	{
		int Score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO GAME1");
		System.out.println("PEAKOCC");
		String A=sc.next().toUpperCase();
		System.out.println("NIOL");
		String B=sc.next().toUpperCase();
		System.out.println("ROTRAP");
		String C=sc.next().toUpperCase();
		System.out.println("SRPAROW");
		String D=sc.next().toUpperCase();
		System.out.println("GERTI");
		String E=sc.next().toUpperCase();
		if (A.equals("PEACOCK"))
		{
			Score+=1;
		}
		if (B.equals("LION"))
		{
			Score+=1;
		}
		if (C.equals("PARROT"))
		{
			Score+=1;
		}
		if (D.equals("SPARROW"))
		{
			Score+=1;
		}
		if (E.equals("TIGER"))
		{
			Score+=1;
		}
		System.out.println("Your score :"+Score);
	}
}
class Game2
{
	Game2()
	{
		int Score=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO GAME2");
		System.out.println("ENTER THE LETTER THAT ARE MISSING IN PLACE OF STARS");
		System.out.println("B**GAL***");
		String a=sc.next().toUpperCase();
		System.out.println("K*NO*");
		String b=sc.next().toUpperCase();
		System.out.println("B***R");
		String c=sc.next().toUpperCase();
		System.out.println("H****ABAD");
		String d=sc.next().toUpperCase();
		System.out.println("C*E***I");
		String e=sc.next().toUpperCase();
		System.out.println("D*L*I");
		String f=sc.next().toUpperCase();
		System.out.println("B*P*");
		String g=sc.next().toUpperCase();
		System.out.println("K***ATA");
		String h=sc.next().toUpperCase();
		System.out.println("NANDI****");
		String i=sc.next().toUpperCase();
		System.out.println("A*U");
		String j=sc.next().toUpperCase();
		if(a.equals("ENURU"))
		{
			Score+=1;
		}
		if(b.equals("UROL"))
		{
			Score+=1;
		}
		if(c.equals("IHA"))
		{
			Score+=1;
		}
		if(d.equals("YDER"))
		{
			Score+=1;
		}
		if(e.equals("HNNA"))
		{
			Score+=1;
		}
		if(f.equals("EH"))
		{
			Score+=1;
		}
		if(g.equals("HOAL"))
		{
			Score+=1;
		}
		if(h.equals("OLK"))
		{
			Score+=1;
		}
		if(i.equals("KOTKUR"))
		{
			Score+=1;
		}
		if(j.equals("LLR"))
		{
			Score+=1;
		}
		System.out.println("Your score :"+Score);
	}
}
class Game
{
	public static void main(String Args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose 1 for GAME1");
		System.out.println("Choose 2 for GAME2");
		int Ch=sc.nextInt();
		switch(Ch)
		{
			case 1:Game1 a=new Game1();
				break;
			case 2:Game2 b=new Game2();
				break;

		}
		
	}
}