package test_zf_1;

import java.util.ArrayList;

import zf_test1.Player;

public class GameController {
	SubmitInfoView s = new SubmitInfoView();
	ArrayList<Player> allplayers = new ArrayList<Player>();{
	
	for (int n = 0; n<4;n++){
		Player x = new Player(s.t.getText());
		allplayers.add(x);
	}
	
	
	
}
	public void printAllPlayers(){
		System.out.println(allplayers.size());
	}
}
