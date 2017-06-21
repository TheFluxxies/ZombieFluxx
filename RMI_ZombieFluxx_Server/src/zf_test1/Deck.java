package zf_test1;

import java.io.IOException;
import java.util.Random;


public class Deck implements Deck_Interface{

	private Card[] cards = new Card[23];
	String naam;


	public void startUp() throws IOException {
		// Fill Deck
				//New Rule
				cards[0] = new Card("hand_limit_0");
				cards[1] = new Card("hand_limit_1");
				cards[2] = new Card("hand_limit_2");
				cards[3] = new Card("hand_limit_3");
				cards[4] = new Card("draw_2");
				cards[5] = new Card("draw_3");
				cards[6] = new Card("draw_4");
				cards[7] = new Card("draw_5");
				cards[8] = new Card("play_2");
				cards[9] = new Card("play_3");
				cards[10] = new Card("play_4");
				cards[11] = new Card("play_all");
				cards[12] = new Card("double_agenda");
				cards[13] = new Card("zombie_season");
				cards[14] = new Card("adrenaline_bonus");
				cards[15] = new Card("no_hand_bonus");
				cards[16] = new Card("eradication_bonus");
				cards[17] = new Card("zombie_boss");
				cards[18] = new Card("look_over_there");
				cards[19] = new Card("its_not_working");
				cards[20] = new Card("zombies_aint_so_bad");
				cards[21] = new Card("dead_friends");
				cards[22] = new Card("weapon_bonus");

				/*

				//action
				cards[23] = new Card("return_of_the_dead");
				cards[24] = new Card("trash_a_keeper");
				cards[25] = new Card("draw_2_and_use_em");
				cards[26] = new Card("no_zombies");
				cards[27] = new Card("lets_do_that_again");
				cards[28] = new Card("and_stay_dead");
				cards[29] = new Card("trade_hands");
				cards[30] = new Card("out_of_ammo");
				cards[31] = new Card("steal_a_keeper");
				cards[32] = new Card("rules_reset");
				cards[33] = new Card("eaten_by_zombies");
				cards[34] = new Card("taxation");
				cards[35] = new Card("lets_simplify");
				cards[36] = new Card("exchange_keepers");
				cards[37] = new Card("take_another_turn");
				cards[38] = new Card("hey_over_here");
				cards[39] = new Card("zombie_jamboree");
				cards[40] = new Card("use_what_you_take");
				cards[41] = new Card("draw_3_play_2_of_them");
				cards[42] = new Card("trash_a_new_rule");
				cards[43] = new Card("lets_shamble");
				cards[44] = new Card("everybody_gets_1");
				cards[45] = new Card("discard_and_draw");

				//Kreepers
				cards[46] = new Card("brains");
				cards[47] = new Card("a_friend_f");
				cards[48] = new Card("donuts");
				cards[49] = new Card("the_shovel");
				cards[50] = new Card("can_of_gasoline");
				cards[51] = new Card("the_shotgun");
				cards[52] = new Card("the_chainsaw");
				cards[53] = new Card("sandwiches");
				cards[54] = new Card("lumber");
				cards[55] = new Card("the_car");
				cards[56] = new Card("a_friend_m");
				cards[57] = new Card("coffee");
				cards[58] = new Card("zombie_repellent");
				cards[59] = new Card("baseball_bat");
				cards[60] = new Card("sonic_tranquilizer");

				//Creepers
				cards[61] = new Card("single_zombie_1");
				cards[62] = new Card("single_zombie_2");
				cards[63] = new Card("single_zombie_3");
				cards[64] = new Card("single_zombie_4");
				cards[65] = new Card("single_zombie_5");
				cards[66] = new Card("single_zombie_6");
				cards[67] = new Card("single_zombie_7");
				cards[68] = new Card("single_zombie_8");
				cards[69] = new Card("pair_of_zombies_1");
				cards[70] = new Card("pair_of_zombies_2");
				cards[71] = new Card("pair_of_zombies_3");
				cards[72] = new Card("zombie_trio_left");
				cards[73] = new Card("zombie_trio_right");
				cards[74] = new Card("zombie_quartet");
				cards[75] = new Card("larry");

				//Goal
				cards[76] = new Card("food_and_gas");
				cards[77] = new Card("barricade_the_windows");
				cards[78] = new Card("ill_hold_em_off");
				cards[79] = new Card("we_need_firewood");
				cards[80] = new Card("provisions");
				cards[81] = new Card("brain_sandwiches");
				cards[82] = new Card("brain_baseball");
				cards[83] = new Card("i_alone_survived");
				cards[84] = new Card("zombie_baseball_team");
				cards[85] = new Card("getaway_driver");
				cards[86] = new Card("hit_the_gas");
				cards[87] = new Card("zombie_victory");
				cards[88] = new Card("donuts_with_coffee");
				cards[89] = new Card("they_fear_fire");
				cards[90] = new Card("four_three_two_one");
				cards[91] = new Card("shotgun");
				cards[92] = new Card("whats_in_the_toolshed");
				cards[93] = new Card("food_for_thought");
				cards[94] = new Card("breakfast_and_lunch");
				cards[95] = new Card("arsenal");
				cards[96] = new Card("zombie_food");
				cards[97] = new Card("were_all_all_right");
				*/
	}

	public Card Draw(){
		Random rand = new Random();
		int number = rand.nextInt(cards.length);
		Card card = cards[number];
		cards[number] = null;
		return card;
	}

	public Card[] DeckList(){
		return(cards);
	}
}
