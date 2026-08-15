public class LongStringSkip {
	public static void main(String[] args) {
		System.out.println(skip("","chgadvapplewb"));
	}

	static String skip(String p,String up){
if(up.isEmpty()) {
		return p;
	}

	if(up.startsWith("apple")){
		return skip(p, up.substring(5));
	}
	else{
		return skip(p+up.charAt(0), up.substring(1));
	}

	}
}
