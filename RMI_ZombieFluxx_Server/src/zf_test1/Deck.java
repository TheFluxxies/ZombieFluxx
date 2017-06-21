package zf_test1;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Random;


public class Deck implements Deck_Interface{

	ArrayList<Card> cards = new ArrayList<Card>();
	String naam;
	Card card;

	public void startUp() throws IOException {
		// Fill Deck
			// NewRule
			cards.add(new Card("New_Rule","hand_limit_0"));
			cards.add(new Card("New_Rule","hand_limit_1"));
			cards.add(new Card("New_Rule","hand_limit_2"));
			cards.add(new Card("New_Rule","hand_limit_3"));
			cards.add(new Card("New_Rule","draw_2"));
			cards.add(new Card("New_Rule","draw_3"));
			cards.add(new Card("New_Rule","draw_4"));
			cards.add(new Card("New_Rule","draw_5"));
			cards.add(new Card("New_Rule","play_2"));
			cards.add(new Card("New_Rule","play_3"));
			cards.add(new Card("New_Rule","play_4"));
			cards.add(new Card("New_Rule","play_all"));
			cards.add(new Card("New_Rule","double_agenda"));
			cards.add(new Card("New_Rule","zombie_season"));
			cards.add(new Card("New_Rule","adrenaline_bonus"));
			cards.add(new Card("New_Rule","no_hand_bonus"));
			cards.add(new Card("New_Rule","eradication_bonus"));
			cards.add(new Card("New_Rule","zombie_boss"));
			cards.add(new Card("New_Rule","look_over_there"));
			cards.add(new Card("New_Rule","its_not_working"));
			cards.add(new Card("New_Rule","zombies_aint_so_bad"));
			cards.add(new Card("New_Rule","dead_friends"));
			cards.add(new Card("New_Rule","weapon_bonus"));

			//action
			cards.add(new Card("Action","return_of_the_dead"));
			cards.add(new Card("Action","trash_a_keeper"));
			cards.add(new Card("Action","draw_2_and_use_em"));
			cards.add(new Card("Action","no_zombies"));
			cards.add(new Card("Action","lets_do_that_again"));
			cards.add(new Card("Action","and_stay_dead"));
			cards.add(new Card("Action","trade_hands"));
			cards.add(new Card("Action","out_of_ammo"));
			cards.add(new Card("Action","steal_a_keeper"));
			cards.add(new Card("Action","rules_reset"));
			cards.add(new Card("Action","eaten_by_zombies"));
			cards.add(new Card("Action","taxation"));
			cards.add(new Card("Action","lets_simplify"));
			cards.add(new Card("Action","exchange_keepers"));
			cards.add(new Card("Action","take_another_turn"));
			cards.add(new Card("Action","hey_over_here"));
			cards.add(new Card("Action","zombie_jamboree"));
			cards.add(new Card("Action","use_what_you_take"));
			cards.add(new Card("Action","draw_3_play_2_of_them"));
			cards.add(new Card("Action","trash_a_new_rule"));
			cards.add(new Card("Action","lets_shamble"));
			cards.add(new Card("Action","everybody_gets_1"));
			cards.add(new Card("Action","discard_and_draw"));

			//Keepers
			cards.add(new Card("Keepers","brains"));
			cards.add(new Card("Keepers","a_friend_f"));
			cards.add(new Card("Keepers","donuts"));
			cards.add(new Card("Keepers","the_shovel"));
			cards.add(new Card("Keepers","can_of_gasoline"));
			cards.add(new Card("Keepers","the_shotgun"));
			cards.add(new Card("Keepers","the_chainsaw"));
			cards.add(new Card("Keepers","sandwiches"));
			cards.add(new Card("Keepers","lumber"));
			cards.add(new Card("Keepers","the_car"));
			cards.add(new Card("Keepers","a_friend_m"));
			cards.add(new Card("Keepers","coffee"));
			cards.add(new Card("Keepers","zombie_repellent"));
			cards.add(new Card("Keepers","baseball_bat"));
			cards.add(new Card("Keepers","sonic_tranquilizer"));

			//Creepers
			cards.add(new Card("Creepers","single_zombie_1"));
			cards.add(new Card("Creepers","single_zombie_2"));
			cards.add(new Card("Creepers","single_zombie_3"));
			cards.add(new Card("Creepers","single_zombie_4"));
			cards.add(new Card("Creepers","single_zombie_5"));
			cards.add(new Card("Creepers","single_zombie_6"));
			cards.add(new Card("Creepers","single_zombie_7"));
			cards.add(new Card("Creepers","single_zombie_8"));
			cards.add(new Card("Creepers","pair_of_zombies_1"));
			cards.add(new Card("Creepers","pair_of_zombies_2"));
			cards.add(new Card("Creepers","pair_of_zombies_3"));
			cards.add(new Card("Creepers","zombie_trio_left"));
			cards.add(new Card("Creepers","zombie_trio_right"));
			cards.add(new Card("Creepers","zombie_quartet"));
			cards.add(new Card("Creepers","larry"));

			//Goal
			cards.add(new Card("Goal","food_and_gas"));
			cards.add(new Card("Goal","barricade_the_windows"));
			cards.add(new Card("Goal","ill_hold_em_off"));
			cards.add(new Card("Goal","we_need_firewood"));
			cards.add(new Card("Goal","provisions"));
			cards.add(new Card("Goal","brain_sandwiches"));
			cards.add(new Card("Goal","brain_baseball"));
			cards.add(new Card("Goal","i_alone_survived"));
			cards.add(new Card("Goal","zombie_baseball_team"));
			cards.add(new Card("Goal","getaway_driver"));
			//cards.add(new Card("Goal","hit_the_gas"));
			cards.add(new Card("Goal","zombie_victory"));
			cards.add(new Card("Goal","donuts_with_coffee"));
			//cards.add(new Card("Goal","they_fear_fire"));
			cards.add(new Card("Goal","four_three_two_one"));
			cards.add(new Card("Goal","shotgun"));
			cards.add(new Card("Goal","whats_in_the_toolshed"));
			cards.add(new Card("Goal","food_for_thought"));
			cards.add(new Card("Goal","breakfast_and_lunch"));
			cards.add(new Card("Goal","arsenal"));
			cards.add(new Card("Goal","zombie_food"));
			cards.add(new Card("Goal","were_all_all_right"));
	}

	public Card Draw(){
		Random rand = new Random();
		int number = rand.nextInt(cards.size());
		Card card = cards.get(number);
		cards.remove(number);
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