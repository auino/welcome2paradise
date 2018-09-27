package core;
// server side implementation

import entities.Destinations;
import entities.Guard;
import entities.Guards;
import entities.Soul;
import exceptions.HellException;
import exceptions.PurgatoryException;

public class ParadiseController {

	public void checkSoul(Soul s) {
		Guard saintPeter = Guards.saintPeter.getGuard();
		try {
			if (saintPeter.accept(s)) {
				Destinations.heaven.take(s);
			}

		} catch (PurgatoryException e) {
			Destinations.purgatory.take(s, e.getPurgatoryTime());
		} catch (HellException e) {
			Destinations.hell.take(s);
		}
	}

}
