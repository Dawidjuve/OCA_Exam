package chapter5.interfaces;

public interface DefaultMethod {
	public default int getNumberOfFins() {
		return 4;
	}

	public default double getLongestFinLength() {
		return 20.0;
	}

	public default boolean doFinsHaveScales() {
		return true;
	}
}

interface SharkFamily extends DefaultMethod {
	public default int getNumberOfFins() {
		return 8;
	}

	public double getLongestFinLength();

//	public boolean doFinsHaveScales() { 
//		return false;
//	}
}