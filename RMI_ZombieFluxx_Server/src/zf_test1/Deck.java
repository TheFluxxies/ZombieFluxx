package zf_test1;

import java.util.ArrayList;
import java.util.Random;

import javafx.collections.ObservableList;
import javafx.scene.Node;

import java.io.IOException;



public class Deck {

	ArrayList<Card> deck = new ArrayList<Card>();
	String naam;
	Card card;

	public void startUp() throws IOException {
		// Fill Deck
			// NewRule
			deck.add(new Card("New_Rule","hand_limit_0"));
			deck.add(new Card("New_Rule","hand_limit_1"));
			deck.add(new Card("New_Rule","hand_limit_2"));
			deck.add(new Card("New_Rule","hand_limit_3"));
			deck.add(new Card("New_Rule","draw_2"));
			deck.add(new Card("New_Rule","draw_3"));
			deck.add(new Card("New_Rule","draw_4"));
			deck.add(new Card("New_Rule","draw_5"));
			deck.add(new Card("New_Rule","play_2"));
			deck.add(new Card("New_Rule","play_3"));
			deck.add(new Card("New_Rule","play_4"));
			deck.add(new Card("New_Rule","play_all"));
			deck.add(new Card("New_Rule","double_agenda"));
			deck.add(new Card("New_Rule","zombie_season"));
			deck.add(new Card("New_Rule","adrenaline_bonus"));
			deck.add(new Card("New_Rule","no_hand_bonus"));
			deck.add(new Card("New_Rule","eradication_bonus"));
			deck.add(new Card("New_Rule","zombie_boss"));
			deck.add(new Card("New_Rule","look_over_there"));
			deck.add(new Card("New_Rule","its_not_working"));
			deck.add(new Card("New_Rule","zombies_aint_so_bad"));
			deck.add(new Card("New_Rule","dead_friends"));
			deck.add(new Card("New_Rule","weapon_bonus"));

			//action
			deck.add(new Card("Action","return_of_the_dead"));
			deck.add(new Card("Action","trash_a_keeper"));
			deck.add(new Card("Action","draw_2_and_use_em"));
			deck.add(new Card("Action","no_zombies"));
			deck.add(new Card("Action","lets_do_that_again"));
			deck.add(new Card("Action","and_stay_dead"));
			deck.add(new Card("Action","trade_hands"));
			deck.add(new Card("Action","out_of_ammo"));
			deck.add(new Card("Action","steal_a_keeper"));
			deck.add(new Card("Action","rules_reset"));
			deck.add(new Card("Action","eaten_by_zombies"));
			deck.add(new Card("Action","taxation"));
			deck.add(new Card("Action","lets_simplify"));
			deck.add(new Card("Action","exchange_keepers"));
			deck.add(new Card("Action","take_another_turn"));
			deck.add(new Card("Action","hey_over_here"));
			deck.add(new Card("Action","zombie_jamboree"));
			deck.add(new Card("Action","use_what_you_take"));
			deck.add(new Card("Action","draw_3_play_2_of_them"));
			deck.add(new Card("Action","trash_a_new_rule"));
			deck.add(new Card("Action","lets_shamble"));
			deck.add(new Card("Action","everybody_gets_1"));
			deck.add(new Card("Action","discard_and_draw"));

			//Keepers
			deck.add(new Card("Keepers","brains"));
			deck.add(new Card("Keepers","a_friend_f"));
			deck.add(new Card("Keepers","donuts"));
			deck.add(new Card("Keepers","the_shovel"));
			deck.add(new Card("Keepers","can_of_gasoline"));
			deck.add(new Card("Keepers","the_shotgun"));
			deck.add(new Card("Keepers","the_chainsaw"));
			deck.add(new Card("Keepers","sandwiches"));
			deck.add(new Card("Keepers","lumber"));
			deck.add(new Card("Keepers","the_car"));
			deck.add(new Card("Keepers","a_friend_m"));
			deck.add(new Card("Keepers","coffee"));
			deck.add(new Card("Keepers","zombie_repellent"));
			deck.add(new Card("Keepers","baseball_bat"));
			deck.add(new Card("Keepers","sonic_tranquilizer"));

			//Creepers
			deck.add(new Card("Creepers","single_zombie_1"));
			deck.add(new Card("Creepers","single_zombie_2"));
			deck.add(new Card("Creepers","single_zombie_3"));
			deck.add(new Card("Creepers","single_zombie_4"));
			deck.add(new Card("Creepers","single_zombie_5"));
			deck.add(new Card("Creepers","single_zombie_6"));
			deck.add(new Card("Creepers","single_zombie_7"));
			deck.add(new Card("Creepers","single_zombie_8"));
			deck.add(new Card("Creepers","pair_of_zombies_1"));
			deck.add(new Card("Creepers","pair_of_zombies_2"));
			deck.add(new Card("Creepers","pair_of_zombies_3"));
			deck.add(new Card("Creepers","zombie_trio_left"));
			deck.add(new Card("Creepers","zombie_trio_right"));
			deck.add(new Card("Creepers","zombie_quartet"));
			deck.add(new Card("Creepers","larry"));

			//Goal
			deck.add(new Card("Goal","food_and_gas"));
			deck.add(new Card("Goal","barricade_the_windows"));
			deck.add(new Card("Goal","ill_hold_em_off"));
			deck.add(new Card("Goal","we_need_firewood"));
			deck.add(new Card("Goal","provisions"));
			deck.add(new Card("Goal","brain_sandwiches"));
			deck.add(new Card("Goal","brain_baseball"));
			deck.add(new Card("Goal","i_alone_survived"));
			deck.add(new Card("Goal","zombie_baseball_team"));
			deck.add(new Card("Goal","getaway_driver"));
			deck.add(new Card("Goal","hit_the_gas"));
			deck.add(new Card("Goal","zombie_victory"));
			deck.add(new Card("Goal","donuts_with_coffee"));
			deck.add(new Card("Goal","they_fear_fire"));
			deck.add(new Card("Goal","four_three_two_one"));
			deck.add(new Card("Goal","shotgun"));
			deck.add(new Card("Goal","whats_in_the_toolshed"));
			deck.add(new Card("Goal","food_for_thought"));
			deck.add(new Card("Goal","breakfast_and_lunch"));
			deck.add(new Card("Goal","arsenal"));
			deck.add(new Card("Goal","zombie_food"));
			deck.add(new Card("Goal","were_all_all_right"));
	}

	public Card Draw(){
		Random rand = new Random();
		int number = rand.nextInt(deck.size());
		Card card = deck.get(number);
		deck.remove(card);
		return card;
	}

	public void toDeck(Card card){
		deck.add(card);
	}

	public int getDeckAmount(){
		return deck.size();
	}
	//Refresh(List Discard){
	//List = Discard;
	//Discard.Clear();
}
