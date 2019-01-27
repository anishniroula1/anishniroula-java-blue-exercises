package com.techelevator;

public class Television {
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	public Television() {
		currentChannel = 3;
		currentVolume = 2;
	}

	/*
	 * - `turnOff()` turns off the tv - `turnOn()` besides turning the tv on, also
	 * resets the channel to 3 and the volume level to 2 - `changeChannel(int
	 * newChannel)` changes the current channel (only if it is on) to the value of
	 * `newChannel` as long as it is between 3 and 18 - `channelUp()` increases the
	 * current channel by 1 (only if it is on). If the value goes past 18, then the
	 * current channel should be set to 3. - `channelDown()` decreases the current
	 * channel by 1 (only if it is on). If the value goes below 3, then the current
	 * channel should be set to 18. - `raiseVolume()` increases the volume by 1
	 * (only if it is on). The limit is 10 - `lowerVolume()` decreases the volume by
	 * 1 (only if it is on). The limit is 0
	 */
	public void turnOff() {

		isOn = false;

	}

	public void turnOn() {

		isOn = true;

	}

	public void changeChannel(int newChannel) {
		if (isOn) {
			if (newChannel >= 3 || newChannel <= 18) {
				currentChannel += newChannel;
			}
			currentChannel = newChannel;
		}
	}

	public void channelUp() {

		if (isOn == true && (currentChannel >= 3 && currentChannel < 18)) {

			currentChannel += 1;
		} else if (isOn == true && currentChannel == 18) {
			currentChannel = 3;
		}

	}

	public void channelDown() {
		if (isOn == true && (currentChannel > 3 && currentChannel <= 18)) {
			currentChannel -= 1;
		} else if (isOn == true && currentChannel == 3) {
			currentChannel = 18;
		}
	}

	public void raiseVolume() {
		if (isOn == true && currentVolume <= 10) {

			currentVolume += 1;

		}
	}

	public void lowerVolume() {
		if (isOn == true) {
			if (currentVolume > 0) {
				currentVolume -= 1;
			}
			
		}
	}

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

}
