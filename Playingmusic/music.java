package Playingmusic;
import java.util.Scanner;





public class music {
	public static void main(String[] args) {
		String filepath1="recording.wav";
		String filepath2="wow.wav";
		String filepath3="Chellama.wav";
		String filepath4="Dandelions.wav";
		String filepath5="Pasoori.wav";
		String filepath6="katy_perry_roar.wav";
		String filepath7="Halmithi.wav";
		String filepath8="Uyire.wav";
		String filepath9="Adada.wav";
		String filepath10="Pavizha.wav";
		musicStuff musicobject=new musicStuff();
		
		
		System.out.println(" insertion front---");
		musicobject.insertfront(filepath1);
		System.out.println("");
		musicobject.display();
		System.out.println("");
		musicobject.playmusic(filepath1);
		System.out.println("");
		System.out.println("after deletion front---");
		musicobject.delete_front();
		System.out.println("");
		musicobject.display();
		System.out.println("");
		
		/*System.out.println(" insertion front---");
		musicobject.insertfront(filepath1);
		System.out.println("");
		System.out.println(" insertion front---");
		musicobject.insertfront(filepath2);
		System.out.println("");
		System.out.println(" insertion back---");
		musicobject.insertback(filepath3);
		System.out.println("");
		musicobject.display();	
		
		
		
		System.out.println("");
		System.out.println("after deletion front---");
		musicobject.delete_front();
		System.out.println("");
		musicobject.display();
		
		musicobject.playmusic(filepath2);
		
		System.out.println("");
		System.out.println("after deletion back---");
		musicobject.delete_back();
		musicobject.display();
		

		System.out.println(" insertion front---");
		musicobject.insertfront(filepath4);
		System.out.println("");
		System.out.println(" insertion front---");
		musicobject.insertfront(filepath5);
		
	
		
		System.out.println("");
		System.out.println("after deletion back---");
		System.out.println("");
		musicobject.delete_back();
		musicobject.display();*/
		System.out.println("************************* ");
		System.out.println("**-----SVS PLAYER-----** ");
		Scanner in=new Scanner(System.in);
		int choice=0;
		while(choice!=7) {
		System.out.println(" ");
		System.out.println("1.Display 2.inserfront  3.insertback  4.deletefront   5.deleteback  6.PLAY_MUSIC   7.exit");
		choice=in.nextInt();
		String add;
		add=in.nextLine();
		switch(choice) {
		case 1:
		musicobject.display();
		break;
		case 2:System.out.println("Enter address to insert front ");
		musicobject.insertfront(in.nextLine());
		break;
		case 3:System.out.println("Enter address to insert back");
		musicobject.insertback(in.nextLine());
		break;
		case 4:
		musicobject.delete_front();
		break;
		case 5:
		musicobject.delete_back();
		break;
		case 6:System.out.println("song u want to listen");
		musicobject.playmusic(in.nextLine());
		break;
		case 7:System.out.println("GOOD BYE");
		break;	
		
		
		}
		}
	

}
}
