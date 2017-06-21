package zf_test1;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Random;


public class Deck implements Deck_Interface{

	ArrayList<Card> cards = new ArrayList<Card>();
	//private Card[] cards = new Card[23];
	String naam;
	Card card;

	public void startUp() throws IOException {
		// Fill Deck
		// NewRule
				cards.add(new Card("hand_limit_0"));
				cards.add(new Card("hand_limit_1"));
				cards.add(new Card("hand_limit_2"));
				cards.add(new Card("hand_limit_3"));
				cards.add(new Card("draw_2"));
				cards.add(new Card("draw_3"));
				cards.add(new Card("draw_4"));
				cards.add(new Card("draw_5"));
				cards.add(new Card("play_2"));
				cards.add(new Card("play_3"));
				cards.add(new Card("play_4"));
				cards.add(new Card("play_all"));
				cards.add(new Card("double_agenda"));
				cards.add(new Card("zombie_season"));
				cards.add(new Card("adrenaline_bonus"));
				cards.add(new Card("no_hand_bonus"));
				cards.add(new Card("eradication_bonus"));
				cards.add(new Card("zombie_boss"));
				cards.add(new Card("look_over_there"));
				cards.add(new Card("its_not_working"));
				cards.add(new Card("zombies_aint_so_bad"));
				cards.add(new Card("dead_friends"));
				cards.add(new Card("weapon_bonus"));

				//action
				cards.add(new Card("return_of_the_dead"));
				cards.add(new Card("trash_a_keeper"));
				cards.add(new Card("draw_2_and_use_em"));
				cards.add(new Card("no_zombies"));
				cards.add(new Card("lets_do_that_again"));
				cards.add(new Card("and_stay_dead"));
				cards.add(new Card("trade_hands"));
				cards.add(new Card("out_of_ammo"));
				cards.add(new Card("steal_a_keeper"));
				cards.add(new Card("rules_reset"));
				cards.add(new Card("eaten_by_zombies"));
				cards.add(new Card("taxation"));
				cards.add(new Card("lets_simplify"));
				cards.add(new Card("exchange_keepers"));
				cards.add(new Card("take_another_turn"));
				cards.add(new Card("hey_over_here"));
				cards.add(new Card("zombie_jamboree"));
				cards.add(new Card("use_what_you_take"));
				cards.add(new Card("draw_3_play_2_of_them"));
				cards.add(new Card("trash_a_new_rule"));
				cards.add(new Card("lets_shamble"));
				cards.add(new Card("everybody_gets_1"));
				cards.add(new Card("discard_and_draw"));

				//Kreepers
				cards.add(new Card("brains"));
				cards.add(new Card("a_friend_f"));
				cards.add(new Card("donuts"));
				cards.add(new Card("the_shovel"));
				cards.add(new Card("can_of_gasoline"));
				cards.add(new Card("the_shotgun"));
				cards.add(new Card("the_chainsaw"));
				cards.add(new Card("sandwiches"));
				cards.add(new Card("lumber"));
				cards.add(new Card("the_car"));
				cards.add(new Card("a_friend_m"));
				cards.add(new Card("coffee"));
				cards.add(new Card("zombie_repellent"));
				cards.add(new Card("baseball_bat"));
				cards.add(new Card("sonic_tranquilizer"));

				//Creepers
				cards.add(new Card("single_zombie_1"));
				cards.add(new Card("single_zombie_2"));
				cards.add(new Card("single_zombie_3"));
				cards.add(new Card("single_zombie_4"));
				cards.add(new Card("single_zombie_5"));
				cards.add(new Card("single_zombie_6"));
				cards.add(new Card("single_zombie_7"));
				cards.add(new Card("single_zombie_8"));
				cards.add(new Card("pair_of_zombies_1"));
				cards.add(new Card("pair_of_zombies_2"));
				cards.add(new Card("pair_of_zombies_3"));
				cards.add(new Card("zombie_trio_left"));
				cards.add(new Card("zombie_trio_right"));
				cards.add(new Card("zombie_quartet"));
				cards.add(new Card("larry"));

				//Goal
				cards.add(new Card("food_and_gas"));
				cards.add(new Card("barricade_the_windows"));
				cards.add(new Card("ill_hold_em_off"));
				cards.add(new Card("we_need_firewood"));
				cards.add(new Card("provisions"));
				cards.add(new Card("brain_sandwiches"));
				cards.add(new Card("brain_baseball"));
				cards.add(new Card("i_alone_survived"));
				cards.add(new Card("zombie_baseball_team"));
				cards.add(new Card("getaway_driver"));
				cards.add(new Card("hit_the_gas"));
				cards.add(new Card("zombie_victory"));
				cards.add(new Card("donuts_with_coffee"));
				cards.add(new Card("they_fear_fire"));
				cards.add(new Card("four_three_two_one"));
				cards.add(new Card("shotgun"));
				cards.add(new Card("whats_in_the_toolshed"));
				cards.add(new Card("food_for_thought"));
				cards.add(new Card("breakfast_and_lunch"));
				cards.add(new Card("arsenal"));
				cards.add(new Card("zombie_food"));
				cards.add(new Card("were_all_all_right"));
	}

	public Card Draw(){
		Random rand = new Random();
		int number = rand.nextInt(cards.size());
		Card card = cards.get(number);
		cards.remove(number);
		//Card card = cards[number];
		//cards[number] = null;
		return card;
	}

	@Override
	public void SayConnected() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCard() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeCard(String Card) throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCard() throws RemoteException {
		// TODO Auto-generated method stub

	}



	//Refresh(List Discard){
	//List = Discard;
	//Discard.Clear();
}
