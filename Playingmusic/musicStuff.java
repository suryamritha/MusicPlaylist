package Playingmusic;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;



import java.util.Scanner;
class Node_dl{
Node_dl next;
Node_dl prev;
String data;

Node_dl(){
data=null;  // starting data and null=0
prev=null;
next=null;
}

Node_dl(String a){
prev=null;
data=a;   // when we add some data 1st ele data=a,next=null;
next=null;
}
}

public class musicStuff {
	
		Node_dl head=null; //obj1ect with value null;
		// initially head = 0;
		musicStuff(){
			head=null;	
		}
		musicStuff(String a){
			head=new Node_dl(a);  // obj1ect for class Node_dl
	// Node_dl with parameter
	// new Node_dl will be created 	
		}
	void insertfront(String musicLocation) {
		if (head==null) {
					head=new Node_dl(musicLocation);	// create a new Node_dl with data as x...1st Node_dl is head now	
				}
		else {
					Node_dl temp=new Node_dl(musicLocation);// another variable temp
					temp.next=head;// newly added 
					head.prev=temp;
					head=temp;
				}
			}
	void insertback(String musicLocation) {
		if(head==null) {
			 head=new Node_dl(musicLocation);
		}
		else {
			Node_dl temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			Node_dl t=new Node_dl(musicLocation);
			temp.next=t;
			t.prev=temp;
			}
		}
	void delete_front() {
		if(head!=null) {
			head=head.next;
			System.out.println("Deletd front");
		}
		else {
			System.out.println("EMPTY");
		}
	}
	void delete_back() {
		//System.out.println("deleted item from back:");
		if(head ==null) {
			System.out.println("EMPTY");
		}
		
		else {
			if(head.next==null) 
				head=null;	
			
			else{Node_dl p=head,temp=head;   // p is to have prev node's address of temp.
	        while(temp.next!=null)
	        {p=temp;             // current temp's address in p
	        temp=temp.next;}     // now temp is moved to next node
	        
	        p.next=null; 
	       // once temp has reached the last node, 
	                      //p will have last but one node's address
	    }
			 System.out.println("Deletd Back");
		}
}
	
	void display() {
		System.out.println("----PLAYLIST----:");
		if(head==null) {
		System.out.println("Empty");
		}
		else {
			Node_dl temp=head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
		
		
		}
		}
	}
	
	void playmusic(String musicLocation)
	{
		System.out.println("Playing song----------- ");
		try {
			File musicPath= new File(musicLocation);
			if(musicPath.exists()) {
				AudioInputStream audioInput=AudioSystem.getAudioInputStream(musicPath);
				Clip clip=AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				JOptionPane.showMessageDialog(null,"Press ok to PAUSE");
				long clipTimePosition=clip.getMicrosecondPosition();
				clip.stop();
				JOptionPane.showMessageDialog(null,"Press ok to RESUME");
				clip.setMicrosecondPosition(clipTimePosition);
				clip.start();
				JOptionPane.showMessageDialog(null,"Press ok to stop playing");
				clip.stop();
			}
			else {
				System.out.println("Can't find file");
			}
			
			
		}
		catch(Exception ex){	
			ex.printStackTrace();
			
		}
		
		
	}
	}
	




