package lv.javaguru.java1.teacher.lesson_16_multithreading.lessoncode;

public class BankAccount {

	private int money;

	public BankAccount(int money) {
		this.money = money;
	}

	// synchronized

	public synchronized void add(int moneyToAdd) {
		this.money = this.money + moneyToAdd;
	}

	public synchronized void remove(int moneyToRemove) {
		this.money = this.money - moneyToRemove;
	}

	public int getMoney() {
		return money;
	}

}
