package powerSwitch;

public class ElectricPowerSwitch {
	public ElectricDevice device;

	public ElectricPowerSwitch(ElectricDevice device) {
		this.device = device;
	}

	public boolean isOn() {
		return device.on;
	}

	public void press() {
		boolean checkOn = isOn();

		if (checkOn) {
			device.turnOff();
			device.on = false;
		} else {
			device.turnOn();
			device.on = true;
		}
	}
}

