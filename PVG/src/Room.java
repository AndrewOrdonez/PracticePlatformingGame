public class Room {
private int roomNum;
private int[][] spawnLocs;
public Room(int rN, int nS ){
	roomNum=rN;
	spawnLocs=new int[nS][3];
	//In spawnLocs, index 0=spawn's number,index 1=x coordinate, index 2=y coordinate.
}
public void setSpawn(int n,int xCoord, int yCoord){
	spawnLocs[n][0]=n;
	spawnLocs[n][1]=xCoord;
	spawnLocs[n][2]=yCoord;
}
public int getSpawnX(int n){
	return spawnLocs[n][1];
}
public int getSpawnY(int n){
	return spawnLocs[n][2];
}
public int getRoomNum(){
	return roomNum;
}
}