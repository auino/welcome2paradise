// server side implementation
function checkSoul(Soul s) {
	Guard saintPeter = new Guards.saintPeter;
	try {
		if(saintPeter.accept(s)) Destinations.heaven.take(s);
	} catch(PurgatoryException e) {
		Destinations.hell.take(s, e.getPurgatoryTime());
	} catch(HellException e) {
		Destinations.hell.take(s);
	}
}
