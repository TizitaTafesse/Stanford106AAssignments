package Adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	private OldCoffeeMachine oldMachine;
	
	
	public void touchScreenAdapter() {
		oldMachine = new OldCoffeeMachine();
	}
	@Override
	public void chooseFirstSelection() {
		
		oldMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		
		oldMachine.selectB();
	}


}
