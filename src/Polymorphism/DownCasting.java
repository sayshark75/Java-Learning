package Polymorphism;

public class DownCasting {
	public static void main(String[] args) {
//		Same reference same object
//		LgOldTv remote = new LgOldTv();
//		remote.start();
//		remote.increaseVolume();
//		remote.changeChannel();
		
		
//		same Reference same object again
//		LgSmartTv remote = new LgSmartTv();
//		remote.start();
//		remote.increaseVolume();
//		remote.changeChannel();
//		remote.playGame();
		
//		parent reference child object
		LgOldTv remote = new LgSmartTv();
		remote.start();
		remote.increaseVolume();
//		Overridden has the priority
		remote.changeChannel(); //smart way
//		we cannot call non-static methods via LgOldTv Reference
//		 analogy : Old tv remote not have play game button
//		 remote.playGame();
		
//		to access the playGame feature, we can do two things
//		either we will create a new object, ex:
//		it will work, but according to analogy: we purchased new tv with remote
//		Which is redundant
//		LgSmartTv sRemote = new LgSmartTv();
		
//		Instead we can do this (Object DownCasting)
		LgSmartTv sRemote = (LgSmartTv)remote;
		sRemote.playGame();
		
	}
}
