package interface1;

public class Train implements Vehicle {

	private int speed;
	private int gas;
	private String name;
	
public Train (String name) {
	this.name = name;	
	this.gas = TRAIN_MAX_GAS;
		this.speed = TRAIN_MIN_SPD;

	}

	@Override
	public void accel() {
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
		  speed = TRAIN_MAX_SPD;
		}else {
			speed += TRAIN_INCREASE_SPD;
			gas -= TRAIN_DECREASE_GAS;
			}
		
	}

	@Override
	public void breakSpeed() {
		if(speed - TRAIN_DECREASE_SPD < TRAIN_MIN_SPD) {
			speed = TRAIN_MIN_SPD;
		}else {
			 speed -= TRAIN_DECREASE_SPD;
		}
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub
		if (gas + TRAIN_REFUEL_GAS >TRAIN_MAX_GAS ) {
			gas = TRAIN_MAX_GAS;
		}else {
			gas += TRAIN_REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : "+ speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 기관사 : " + name);
		System.out.println("-----------------");
		
	}
}