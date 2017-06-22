import java.util.ArrayList;

import zf_test1.Card;

public class Newrule {

	//hand limit
	ArrayList<Card> hand = new ArrayList<Card>();
	void hand_limit_0(){
		if(player == active){
			//doe niks
		}
		else {
			hand.clear();
		}
	}
	
	void hand_limit_1(){
		if(player == active){
			//doe niks
		}
		else if(hand.size() > 1 ){	
			//speler kiest 1 kaart om te behouden
		}
	}
	
	void hand_limit_2(){
		if(player == active){
			//doe niks
		}
		else if(hand.size()> 2 ){	
			//speler kiest 2 kaarten om te behouden
		}
	}
	
	void hand_limit_3(){
		if(player == active){
			//doe niks
		}
		else if(hand.size() > 3 ){	
			//speler kiest 3 kaarten om te behouden
		}
	}
	//draw cards
	void draw_2(){
		this.draw = 2;
	}
	
	void draw_3(){
		this.draw = 3;
	}
	
	void draw_4(){
		this.draw = 4;
	}
	
	void draw_5(){
		this.draw = 5;
	}
	
	//play cards
	void play_2(){
		this.play = 2;
	}
	
	void play_3(){
		this.play = 3;
	}
	
	void play_4(){
		this.play = 4;
	}
	
	void play_all(){
		this.play = hand.size();
	}
}