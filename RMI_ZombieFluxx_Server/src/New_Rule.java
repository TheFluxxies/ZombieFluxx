import java.util.ArrayList;

import zf_test1.Card;

public class New_Rule {

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

	
	//adrenaline bonus
	if(aantalZombies > 1){
		draw() + 1;
		play() + 1;
	}
	
	//dead friends
	if(Friend > 1){
		friend == zombie
	}
	
	//double agenda
	create Second_Goal Spot;
	update.this();
	//maak een 2e agenda plaats, systeem update en kijkt of de goal is behaald
	
	//eradication bonus
	int zombies = 12;
	if(zombies == 0){
		draw() + 1
	}
	
	//its not working
	zombie_repellent = 0;
	sonic_tranquilizer = 0;
	
	//look, over there!
	//als een speler een van deze keepers heeft
	brains();
	friend_f();
	friend_m();
	sandwiches();
	coffee();
	donuts();
	//mogen zombies daar heen gestuurd worden
	
	//no-hand bonus
	if(hand == 0){
		draw() + 3;
	}
	
	//weapon bonus
	//elk wapen krijgt dezelfde eigenschappen als de shotgun
	if(pow > 1){
		weapon = shotgun;
	}
	
	//zombie boss
	
	
	
}
}

