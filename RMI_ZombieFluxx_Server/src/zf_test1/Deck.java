package zf_test1;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Deck implements Deck_Interface{
	
	//private Card[] deck = new Card[100];
	ArrayList<String> cards = new ArrayList<String>();
	
	//private int topCard; 
	String naam;
	
	Deck() {
		// NewRule
				cards.add("hand_limit_0");
				cards.add("hand_limit_1");
				cards.add("hand_limit_2");
				cards.add("hand_limit_3");
				cards.add("draw_2");
				cards.add("draw_3");
				cards.add("draw_4");
				cards.add("draw_5");
				cards.add("play_2");
				cards.add("play_3");
				cards.add("play_4");
				cards.add("play_all");
				cards.add("double_agenda");
				cards.add("zombie_season");
				cards.add("adrenaline_bonus");
				cards.add("no_hand_bonus");
				cards.add("eradication_bonus");
				cards.add("zombie_boss");
				cards.add("look_over_there");
			    cards.add("groaning_required");
				cards.add("its_not_working");
				cards.add("zombies_aint_so_bad");
				cards.add("dead_friends");
				cards.add("weapon_bonus");
				
				//action
				cards.add("return_of_the_dead");
				cards.add("trash_a_keeper");
				cards.add("draw_2_and_use_em");
				cards.add("no_zombies");
				cards.add("lets_do_that_again");
				cards.add("and_stay_dead");
				cards.add("trade_hands");
				cards.add("out_of_ammo");
				cards.add("steal_a_keeper");
				cards.add("rules_reset");
				cards.add("eaten_by_zombies");
				cards.add("taxation");
				cards.add("lets_simplify");
				cards.add("exchange_keepers");
				cards.add("take_another_turn");
				cards.add("hey_over_here");
				cards.add("zombie_jamboree");
				cards.add("use_what_you_take");
				cards.add("draw_3_play_2_of_them");
				cards.add("trash_a_new_rule");
				cards.add("lets_shamble");
				cards.add("everybody_gets_1");
				cards.add("discard_and_draw");
				
				//Kreepers
				cards.add("brains");
				cards.add("a_friend_f");
				cards.add("donuts");
				cards.add("the_shovel");
				cards.add("can_of_gasoline");
				cards.add("the_shotgun");
				cards.add("the_chainsaw");
				cards.add("sandwiches");
				cards.add("lumber");
				cards.add("the_car");
				cards.add("a_friend_m");
				cards.add("coffee");
				cards.add("zombie_repellent");
				cards.add("baseball_bat");
				cards.add("sonic_tranquilizer");

				//Creepers
				cards.add("single_zombie_1");
				cards.add("single_zombie_2");
				cards.add("single_zombie_3");
				cards.add("single_zombie_4");
				cards.add("single_zombie_5");
				cards.add("single_zombie_6");
				cards.add("single_zombie_7");
				cards.add("single_zombie_8");
				cards.add("pair_of_zombies_1");
				cards.add("pair_of_zombies_2");
				cards.add("pair_of_zombies_3");
				cards.add("zombie_trio_left");
				cards.add("zombie_trio_right");
				cards.add("zombie_quartet");
				cards.add("larry");
				
				//Goal
				cards.add("food_and_gas");
				cards.add("barricade_the_windows");
				cards.add("ill_hold_em_off");
				cards.add("we_need_firewood");
				cards.add("provisions");
				cards.add("brain_sandwiches");
				cards.add("brain_baseball");
				cards.add("i_alone_survived");
				cards.add("zombie_baseball_team");
				cards.add("getaway_driver");
				cards.add("hit_the_gas");
				cards.add("zombie_victory");
				cards.add("donuts_with_coffee");
				cards.add("they_fear_fire");
				cards.add("four_three_two_one");
				cards.add("shotgun");
				cards.add("whats_in_the_toolshed");
				cards.add("food_for_thought");
				cards.add("breakfast_and_lunch");
				cards.add("arsenal");
				cards.add("zombie_food");
				cards.add("were_all_all_right");
	}
	
	public void shuffle(){
		Collections.shuffle(Arrays.asList(cards));
	}
	
	public Card dealCard(){
		// this comment
		
		return null;
		
	}

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Deck Pile is Connected to Client");
	}

	@Override
	public void addCard() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCard() throws RemoteException {
		// 
		//cards.remove();
	}
		
	@Override
	public void getCard() throws RemoteException {
		// 
		System.out.println(cards.size());
	}
	
	
}
