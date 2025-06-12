package Training;

public interface Calculator {
	double add();
	default int add(int X,int Y) {
		return X+Y;
	}
	static void log(String s) {
		System.out.println(s);
	}
	static String createEmail(String f, String l) {
        return f + "." + l + "@mru.hyd.in";
    }
}
