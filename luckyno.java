import java.util.Random ;
import java.util.Scanner ;

public class Alpha
{
	public static void main(String [] args)
	{
			int choice ,data;
			int score = 0 ;
			Random rand = new Random() ;
			while(true)
			{
				int ch = rand.nextInt(6) ;
				System.out.println("1->Play 2->Show score 3->Exit\nEnter your choice") ;
				Scanner sc = new Scanner(System.in) ;
				choice = sc.nextInt() ;
				switch (choice)
				{
					case 1 : 
						System.out.println("Enter your lucky Number ") ;
						data = sc.nextInt();
						if (data == ch) 
							{
									System.out.println("You got it right");
									score ++ ;
							}
						else 
							{
									System.out.println("Oops! try again");
							}	
						break ;
					case 2 :
								System.out.println(score);
								break ;
					case 3 :
								System.exit(0) ;
					default :
						System.out.println("Invalid Choice") ;

				}
			}
	}
}
