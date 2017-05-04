import java.util.ArrayList;

public class RoomProtocols {
	

	public static void runRoom() {
		// TODO Auto-generated method stub
		switch(Runner.currentRoom.getRoomNum()){
		case 0:run0();break;
		case 1:run1();break;
		case 2:run2();break;
		case 3:run3();break;
		case 4:run4();break;
		case 5:run5();break;
		}
	}
	public static void run1(){
		 if (DrawPanel.y<=300&&DrawPanel.x<200&&Runner.l){
	    		if(DrawPanel.x<11){
	    			DrawPanel.x=11;
	    		}
	    		Runner.gravity(300);
	    	}
	    	  if((DrawPanel.x>=200||(!Runner.l))){
	    		 if (DrawPanel.y>300){
	    			 Runner.l=false;
	    		 }
	    		 if (DrawPanel.x<-9){
	    			 Runner.setNewRoom(-1);
	    			 Runner.setSpawn(Runner.currentRoom, 0);
	    		 }
	    		 else if(DrawPanel.x>1000){
	    			 Runner.setNewRoom(1);
	    			 Runner.setSpawn(Runner.currentRoom, 0);
	    		 }
	    	Runner.gravity(450);
	    	}
	}	
	
	public static void run0(){
		if(DrawPanel.x<11){
			DrawPanel.x=11;
		}
	
		 else if(DrawPanel.x>1000){
			 Runner.setNewRoom(1);
			 Runner.setSpawn(Runner.currentRoom, 0);
		 }
	Runner.gravity(450);
	}	
	
	public static void run2(){
		
	
		  if(DrawPanel.x<-10){
			 Runner.setNewRoom(-1);
			 Runner.setSpawn(Runner.currentRoom, 1);
		 }
		  if (DrawPanel.y>510){
			  Runner.setNewRoom(1);
			  Runner.setSpawn(Runner.currentRoom, 0);
		  }
		  if(DrawPanel.y>1000){
			  DrawPanel.y=0;
		  }
		  if(DrawPanel.x>500){
			  Runner.gravity(1500);
		  }
		  else{
	Runner.gravity(450);}
	}
	public static void run3(){
		Runner.gravity(420);
		  if(DrawPanel.x<-10){
			 Runner.setNewRoom(2);
			 Runner.setSpawn(Runner.currentRoom, 1);
		 }
		 else if(DrawPanel.x>1000){
				 Runner.setNewRoom(1);
				 Runner.setSpawn(Runner.currentRoom, 0);
		 }
	}
	public static void run4(){
		Runner.gravity(420);
		if (DrawPanel.x<0){
			Runner.setNewRoom(-1);
			Runner.setSpawn(Runner.currentRoom, 2);
		}
		
	}
	public static void run5(){
		Runner.gravity(420);
		if (DrawPanel.x>1000){
			Runner.setNewRoom(-2);
			Runner.setSpawn(Runner.currentRoom, 0);
		}
		if (DrawPanel.x<200){
			DrawPanel.x=200;
		}
	}
//Big ass list of rooms:
	static ArrayList<Room> roomList=new ArrayList<Room>();
	
}