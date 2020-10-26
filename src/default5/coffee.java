package default5;

public class coffee {

	public class CoffeeTouchscreenAdapter<theMachine> implements CoffeeMachineInterface {
		static OldCoffeeMachine theMachine;

		public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
			theMachine = newMachine;
		}

		public void chooseFirstSelection() {
			theMachine.selectA();
		}

		public void chooseSecondSelection() {
			theMachine.selectB();
		}

		public static void main(String[] args) {
			CoffeeTouchscreenAdapter<String> d = new CoffeeTouchscreenAdapter<String>(theMachine);

			d.chooseFirstSelection();
			d.chooseSecondSelection();
		}
	}
}