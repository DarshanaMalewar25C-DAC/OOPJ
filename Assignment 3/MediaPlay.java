/*
25. Media Player 
Scenario: A media player can play both Audio and Video files. 
Problem Statement: 
● Interface AudioPlayer → method playAudio(String song) 
● Interface VideoPlayer → method playVideo(String movie) 
● Class MediaPlayer implements both → provides implementation for both methods 
Sample Input: 
Audio → song="Shape of You" 
Video → movie="Inception" 
Sample Output: 
Playing Audio: Shape of You 
Playing Video: Inception
*/

interface AudioPlayer{
	void playAudio(String song);
}

interface VideoPlayer{
	void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
	String song;
	String movie;
	
	MediaPlayer(String song,String movie){
		this.song=song;
		this.movie=movie;
	}
	public void playAudio(String song){
		System.out.println("Playing Audio: "+song);
	}
	public void playVideo(String movie){
		System.out.println("Playing Video: "+movie);
	}
}
 

class MediaPlay {
	public static void main(String args[]){
		MediaPlayer m1 = new MediaPlayer("Song Title", "Artist Name");
		m1.playAudio("Shape of You");
		m1.playVideo("Inception");
	}
}
		 
		